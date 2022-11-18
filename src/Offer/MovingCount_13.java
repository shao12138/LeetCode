package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MovingCount_13 {
    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int movingCount(int m, int n, int k) {
        ArrayList arrayList = new ArrayList();
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, 0});
        arrayList.add(0 + "," + 0);
        while (!queue.isEmpty()) {
            int[] middle = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = middle[0] + dx[i];
                int newY = middle[1] + dy[i];
                int[] newPoint = new int[]{newX, newY};
                if (!arrayList.contains(newX + "," + newY)) {
                    int t = subtractProductAndSum(newX) + subtractProductAndSum(newY);
                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && t <= k) {
                        queue.add(newPoint);
                        arrayList.add(newX + "," + newY);
                    }
                }
            }
        }
        return arrayList.size();
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
