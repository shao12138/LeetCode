package JinDian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PondSizes_79 {
    int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

    public int[] pondSizes(int[][] land) {
        ArrayList<Integer> result = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Queue<int[]> queue = new LinkedList();
        int heigh = land.length;
        int width = land[0].length;
        int max = 0;
        for (int i = 0; i < heigh; i++) {
            queue.clear();
            for (int j = 0; j < width; j++) {
                if (land[i][j] == 0) {
                    max = 0;
                    if (!arrayList.contains(new int[]{i, j})) {
                        max++;
                        queue.add(new int[]{i, j});
                        arrayList.add(new int[]{i, j});
                        land[i][j] = 1;
                        while (!queue.isEmpty()) {
                            int middle[] = queue.poll();
                            for (int k = 0; k < 8; k++) {
                                int newX = middle[0] + dx[k];
                                int newY = middle[1] + dy[k];
                                int[] newPoint = new int[]{newX, newY};
                                if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && land[newX][newY] == 0) {
                                    arrayList.add(newPoint);
                                    queue.add(newPoint);
                                    land[newX][newY] = 1;
                                    max++;
                                }
                            }
                        }
                        result.add(max);
                    }
                }
            }
        }
        int[] re = new int[result.size()];
        for (int i = 0; i < re.length; i++) {
            re[i] = result.get(i);
        }
        Arrays.sort(re);
        return re;
    }
}
