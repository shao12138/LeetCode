package SuanFa_RuMen;

import java.util.Arrays;


public class MinSubArrayLen_209 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 7};
        int targer = 7;
        minSubArrayLen(targer, nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}