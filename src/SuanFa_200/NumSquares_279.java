package SuanFa_200;

import java.util.ArrayList;
import java.util.Arrays;

public class NumSquares_279 {
    public static void main(String[] args) {
        int n = 12;
        numSquares(n);
    }

    public static int numSquares(int n) {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (isPerfectSquare(i)) {
                arrayList.add(i);
            }
        }
        Integer[] a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
        return coinChange(a, n);
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 2) {
            return false;
        }
        int left = 1;
        int right = num;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int temp = num / middle;
            if (temp > middle) {
                left = middle + 1;

            } else if (temp < middle) {
                right = middle - 1;
            } else if (temp == middle) {
                if (num % middle == 0) return true;
                left = middle + 1;
            }
        }
        return false;
    }

    public static int coinChange(Integer[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
