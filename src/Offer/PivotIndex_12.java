package Offer;

public class PivotIndex_12 {
    public static void main(String[] args) {
        int[] x = new int[]{2, 1, -1};
        System.out.println(pivotIndex(x));
    }

    public static int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int all = sum[sum.length - 1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum[i] == all - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
