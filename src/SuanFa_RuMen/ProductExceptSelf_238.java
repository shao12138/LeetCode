package SuanFa_RuMen;

public class ProductExceptSelf_238 {
    public static void main(String[] args) {
        int[] a = new int[]{-1,1,0,-3,3};
        productExceptSelf(a);
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int temp = 1;
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            temp *= nums[i - 1];
            left[i] = temp;
        }
        temp = 1;
        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            temp *= nums[i + 1];
            right[i] = temp;
        }
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
