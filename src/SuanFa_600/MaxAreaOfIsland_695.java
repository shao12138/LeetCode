package SuanFa_600;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaOfIsland_695 {
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        ArrayList arrayList = new ArrayList();
        Queue<int[]> queue = new LinkedList();
        int heigh = grid.length;
        int width = grid[0].length;
        int max = 0;
        for (int i = 0; i <heigh; i++) {
            queue.clear();
            for (int j = 0; j < width; j++) {
                int temp = 0;
                if (grid[i][j] == 1) {
                    if (!arrayList.contains(new int[]{i, j})) {
                        queue.add(new int[]{i, j});
                        arrayList.add(new int[]{i, j});
                        grid[i][j]=0;
                        while (!queue.isEmpty()) {
                            int middle[] = queue.poll();
                            temp += 1;
                            for (int k = 0; k < 4; k++) {
                                int newX = middle[0] + dx[k];
                                int newY = middle[1] + dy[k];
                                int[] newPoint = new int[]{newX, newY};
                                if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && grid[newX][newY] == 1) {
                                    arrayList.add(newPoint);
                                    queue.add(newPoint);
                                    grid[newX][newY]=0;
                                }
                            }
                        }
                        if (max<temp){
                            max = temp;
                        }
                    }
                }
            }
        }
        return max;
    }
}
