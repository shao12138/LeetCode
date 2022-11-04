package SuanFa_1600;

import java.util.Arrays;

public class MaxProfit_1648 {
    public static void main(String[] args) {
        int[] inventory = new int[]{1000000000,1000000000,1000000000};
        System.out.println(maxProfit(inventory, 1000000000));
    }

    public static int maxProfit(int[] inventory, int orders) {
        // 很明显，应该先卖个数最多的球
        int mod = 1000000007;
        Arrays.sort(inventory);
        int curIndex = inventory.length - 1;
        long curValue = inventory[curIndex];

        long profit = 0;
        while (orders > 0) {
            while (curIndex >= 0 && inventory[curIndex] == curValue) {
                curIndex--;
            }
            // 令最少的为0球，防止越界
            long nextValue = curIndex < 0 ? 0 : inventory[curIndex];
            // 目前球相等的个数
            int numSameColor = inventory.length - 1 - curIndex;
            // 将要买的球的个数
            long nums = (long)(curValue - nextValue) * numSameColor;

            if (orders > nums) {
                // 如果还可以买的个数较多，就直接全买
                profit += (long) (curValue + nextValue + 1) * (curValue - nextValue) / 2 * numSameColor;
            } else {
                // 不能全买
                int numFullRow = orders / numSameColor;
                int remainder = orders % numSameColor;
                profit += (long) (curValue + curValue - numFullRow + 1) * numFullRow / 2 * numSameColor;
                profit += (long) (curValue - numFullRow) * remainder;
            }
            orders -= nums;
            profit = profit % mod;
            curValue = nextValue;
        }
        return (int) profit;
    }
}
