package JinDian;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill_50 {
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<int[]> queue = new LinkedList<>();
        int heigh = image.length;
        int width = image[0].length;
        boolean[][] visited = new boolean[heigh][width];
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] middle = queue.poll();
            for (int k = 0; k < 4; k++) {
                int newX = middle[0] + dx[k];
                int newY = middle[1] + dy[k];
                int[] newPoint = new int[]{newX, newY};
                if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && visited[newX][newY] == false && image[newX][newY] == oldColor) {
                    queue.add(newPoint);
                    visited[newX][newY] = true;
                    image[newX][newY] = newColor;
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        floodFill(image, sr, sc, newColor);
    }
}