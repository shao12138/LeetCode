package SuanFa_RuMen;

public class NumSubarrayProductLessThanK_713 {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,1};
        int k = 2;
        System.out.println(numSubarrayProductLessThanK(a, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int length = 1;
        int result = 0;
        while (length < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                int sum = nums[i];
                for (int j = i + 1; j < length; j++) {
                    sum *= nums[j];
                }
                if (sum < k) {
                    result++;
                }
            }
            length++;
        }
        return result;
    }
}
