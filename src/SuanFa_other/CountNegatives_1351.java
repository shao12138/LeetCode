package SuanFa_other;

public class CountNegatives_1351 {
    public int countNegatives(int[][] grid) {
        int result = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
