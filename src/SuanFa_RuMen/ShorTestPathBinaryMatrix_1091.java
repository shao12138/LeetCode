package SuanFa_RuMen;

import java.util.LinkedList;
import java.util.Queue;

public class ShorTestPathBinaryMatrix_1091 {
    static int[] dx = {1, -1, 0, 0, 1, -1, -1, 1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

    public static void main(String[] args) {
        //int[][]a = new int[][]{{0,0,0},{1,1,0},{1,1,0}};
        int[][] a = new int[][]{{0, 0, 0, 0, 1}, {1, 0, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(a));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int heigh = grid.length;
        int width = grid[0].length;
        int start = grid[0][0];
        if (heigh == 1) {
            if (grid[0][0] == 1) {
                return -1;
            } else {
                return 1;
            }
        } else if (heigh == 0) {
            return -1;
        } else if (start == 1) {
            return -1;
        } else if (grid[heigh - 1][heigh - 1] == 1) {
            return -1;
        } else {
            queue.add(new int[]{0, 0});
        }
        int min = 1;
        while (!queue.isEmpty()) {
            min++;
            int levelNum = queue.size();//获取当前层的节点数.
            for (int j = 0; j < levelNum; j++) {
                int[] cell = queue.poll();
                for (int i = 0; i < dx.length; i++) {
                    int newX = cell[0] + dx[i];
                    int newY = cell[1] + dy[i];
                    if (newX == heigh - 1 && newY == newX && grid[newX][newY] == 0) {
                        return min;
                    }
                    if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && grid[newX][newY] == 0) {
                        queue.add(new int[]{newX, newY});
                        grid[newX][newY] = 1;
                    }
                }
            }
        }
        return -1;
    }
}
