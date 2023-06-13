package JinDian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintKMoves_82 {
    public static void main(String[] args) {
        int num = 2;
        printKMoves(num);
    }

    public static List<String> printKMoves(int K) {
        ArrayList result = new ArrayList();
        String[][] grid = new String[2][2]; // 初始网格大小为2 x 2
        int x = 0, y = 0; // 初始位置为(0, 0)
        int dx = 0, dy = 1; // 初始朝向为向右
        Arrays.fill(grid, "_");
        for (int i = 0; i < K; i++) {
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) { // 如果走出了网格，则扩大网格
                String[][] newGrid = new String[grid.length * 2][grid[0].length * 2];
                for (int j = 0; j < grid.length; j++) {
                    for (int k = 0; k < grid[0].length; k++) {
                        newGrid[j + grid.length][k + grid[0].length] = grid[j][k];
                    }
                }
                x += grid.length;
                y += grid[0].length;
                grid = newGrid;
            }
            if (grid[x][y].equals("_")) { // 在白色方格上
                grid[x][y] = "X"; // 翻转方格颜色
                int temp = dx;
                dx = dy;
                dy = -temp; // 顺时针旋转90度
            } else { // 在黑色方格上
                grid[x][y].equals("_"); // 翻转方格颜色
                int temp = dx;
                dx = -dy;
                dy = temp; // 逆时针旋转90度
            }
            x += dx;
            y += dy; // 移动到下一个位置
        }
        if (dx == 0 && dy == 1) {
            grid[x][y] = "R";
        } else if (dx == 0 && dy == -1) {
            grid[x][y] = "L";
        } else if (dx == 1 && dy == 0) {
            grid[x][y] = "U";
        } else if (dx == -1 && dy == 0) {
            grid[x][y] = "D";
        }
        for (int i = 0; i < grid.length; i++) {
            String temp = "";
            for (int j = 0; j < grid[0].length; j++) {
                temp += grid[i][j];
            }
            result.add(temp);
        }
        return result;
    }
}
