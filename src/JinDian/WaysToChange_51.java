package JinDian;

public class WaysToChange_51 {
    public int waysToChange(int n) {
        int dp[] = new int[n + 1];
        int[] tokens = {1, 5, 10, 25};
        int mod = 1000000007;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= n; j++) {
                if (tokens[i] == j) {               //硬币刚好等于当前面额
                    dp[j] = (dp[j] + 1) % mod;
                } else if (tokens[i] < j) {         //硬币小于当前面额
                    dp[j] = (dp[j] + dp[j - tokens[i]]) % mod;
                }                               //硬币大于当前面额，dp[j] = dp[j]，省略了
            }
        }
        return dp[n];
    }
}
