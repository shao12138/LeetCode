package Offer;

public class MaxValue_47 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        maxValue(nums);
    }

    public static int maxValue(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 & j != 0) {
                    nums[0][j] += nums[0][j - 1];
                    continue;
                }
                if (j == 0 & i != 0) {
                    nums[i][0] += nums[i - 1][0];
                    continue;
                }
                if (j == 0 & i == 0) {
                    continue;
                }
                nums[i][j] += Math.max(nums[i][j - 1], nums[i - 1][j]);
            }
        }
        return nums[m - 1][n - 1];
    }
}
