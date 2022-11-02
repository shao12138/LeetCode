package SuanFa_1900;

import java.util.LinkedList;
import java.util.Queue;

public class FindPeakGrid_1901 {
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[] findPeakGrid(int[][] mat) {
        Queue<int[]> queue = new LinkedList();
        int heigh = mat.length;
        int width = mat[0].length;
        int[] t = new int[]{0, 0};
        queue.add(t);
        while (!queue.isEmpty()) {
            int middle[] = queue.poll();
            int k = 0;
            for (; k < 4; k++) {
                int newX = middle[0] + dx[k];
                int newY = middle[1] + dy[k];
                int[] newPoint = new int[]{newX, newY};
                if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && mat[newX][newY] > mat[middle[0]][middle[1]]) {
                    queue.add(newPoint);
                    break;
                }
            }
            if (k == 4) {
                return middle;
            }
        }
        return null;
    }
}
