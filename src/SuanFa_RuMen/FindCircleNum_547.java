package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindCircleNum_547 {
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(findCircleNum(a));
    }

    public static int findCircleNum(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int heigh = grid.length;
        int width = grid[0].length;
        int max = 0;
        for (int i = 0; i < heigh; i++) {
            queue.clear();
            //没有被访问过
            if (grid[i][i] == 1) {
                max++;
                System.out.println(i);
                grid[i][i] = 0;
                for (int j = i+1; j < width; j++) {
                    if (grid[i][j] == 1) {
                        queue.add(new int[]{j, j});
                        grid[i][j] = 0;
                        grid[j][j] = 0;
                        grid[j][i] = 0;
                    }
                }
                while (!queue.isEmpty()) {
                    int middle[] = queue.poll();
                    for (int j = 0; j < width; j++) {
                        if (grid[middle[0]][j] == 1) {
                            queue.add(new int[]{j, j});
                            grid[middle[0]][j] = 0;
                            grid[j][j] = 0;
                            grid[j][middle[0]] = 0;
                        }
                    }
                }
            }
        }
        return max;
    }
}
