package SuanFa_RuMen;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill_733 {
     static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        floodFill(new int[][]{{0,0,0},{0,0,0}},0,0,0);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if (currColor == color) return image;
        int oldColor = image[sr][sc];
        int heigh = image.length;
        int width = image[0].length;
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{sr, sc});
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int middle[] = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = middle[0] + dx[i];
                int newY = middle[1] + dy[i];
                int[] newPoint = new int[]{newX, newY};
                if (newX>=0&&newX<heigh&&newY>=0&&newY<width&&image[newX][newY]==oldColor){
                    queue.add(newPoint);
                    image[newX][newY]=color;
                }
            }
        }
        return image;
    }
}
