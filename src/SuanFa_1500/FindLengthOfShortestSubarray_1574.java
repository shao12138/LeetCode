package SuanFa_1500;

import java.util.Arrays;

public class FindLengthOfShortestSubarray_1574 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 0, 14, 7, 18, 18, 18, 16, 8, 15, 20};
        findLengthOfShortestSubarray(arr);
    }

    public static int findLengthOfShortestSubarray(int[] arr) {
        int length = findNumberOfLIS(arr);
        return arr.length - length;
    }

    public static int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int[] combination = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(combination, 1);
        int max = 1, res = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] >= nums[j]) {
                    if (dp[j] + 1 > dp[i]) { //如果+1长于当前LIS 则组合数不变
                        dp[i] = dp[j] + 1;
                        combination[i] = combination[j];
                    } else if (dp[j] + 1 == dp[i]) { //如果+1等于当前LIS 则说明找到了新组合
                        combination[i] += combination[j];
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
