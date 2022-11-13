package Offer;

public class MaxSubArray_42 {
    public int maxSubArray(int[] nums) {
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            m = Math.max(m, nums[i]);
        }
        return m;
    }
}
