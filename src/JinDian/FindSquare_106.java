package JinDian;

public class FindSquare_106 {
    public int[] findSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // 遍历长度，左上角的位置
        int limit = Math.min(m, n);
        for (int l = limit; l >= 1; l--) {
            for (int i = 0; i <= m - l; i++) {
                for (int j = 0; j <= n - l; j++) {
                    if (check(i, j, l, grid))
                        return new int[]{i, j, l };
                }
            }
        }
        return new int[]{};
    }

    public boolean check(int r, int c, int l, int[][] grid) {
        // 查看边界是否全为1
        for (int i = r; i < r + l; i++) {
            if (grid[i][c] == 1) return false;
            if (grid[i][c + l - 1] == 1) return false;
        }
        for (int j = c; j < c + l; j++) {
            if (grid[r][j] == 1) return false;
            if (grid[r + l - 1][j] == 1) return false;
        }
        return true;
    }
}
