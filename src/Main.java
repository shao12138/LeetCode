import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[][]{{0, 0, 5, 5}, {4, 4, 2, 2}};
        getWhiteCounts(a);
    }

    public static int getWhiteCounts(int[][] rects) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < rects.length; i++) {
            int x1 = rects[i][0];
            int y1 = rects[i][1];
            int x2 = rects[i][2];
            int y2 = rects[i][3];

            int minx = 0;
            int maxx = 0;
            int miny = 0;
            int maxy = 0;

            if (x1 < x2) {
                minx = x1;
                maxx = x2;
            } else {
                minx = x2;
                maxx = x1;
            }
            if (y1 < y2) {
                miny = y1;
                maxy = y2;
            } else {
                miny = y2;
                maxy = y1;
            }

            for (int x = minx; x < maxx; x++) {
                for (int y = miny; y < maxy; y++) {
                    int[] position = new int[]{x, y};
                    int code = x * 100000 + y;
                    if (hashSet.contains(code)) {
                        System.out.println("123");
                        hashSet.remove(code);
                    } else {
                        hashSet.add(code);
                    }
                }
            }
        }
        return 10000 - hashSet.size();
    }
}