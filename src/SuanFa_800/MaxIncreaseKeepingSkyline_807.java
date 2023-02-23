package SuanFa_800;

public class MaxIncreaseKeepingSkyline_807 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        maxIncreaseKeepingSkyline(grid);
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int length = grid.length;
        int result = 0;
        int[] maxRow = new int[length];
        int[] maxCol = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                maxRow[i] = Math.max(grid[i][j], maxRow[i]);
                maxCol[j] = Math.max(grid[i][j], maxCol[j]);
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result += Math.min(maxCol[j] - grid[i][j], maxRow[i] - grid[i][j]);
            }
        }
        return result;

    }
}
