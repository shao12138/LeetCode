package SuanFa_RuMen;

import java.util.Arrays;

public class LengthOfLIS_300 {
    public static void main(String[] args) {
        int[]nums = new int[]{10,9,2,5,3,7,101,18};
        lengthOfLIS(nums);
    }
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int len = 1;
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                //i:以i结尾的递增序列的最长长度
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                    len = Math.max(dp[i],len);
                }
            }
        }
        return len;
    }
}
