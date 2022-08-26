package SuanFa_900;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosest_973 {
    public static void main(String[] args) {
        int[][] s= new int[][]{{1,3},{-2,2}};
        kClosest(s,1);
    }
    public static int[][] kClosest(int[][] points, int k) {
        Map<int[], Double> occurrences = new HashMap<int[], Double>();
        for (int[] temp : points) {
            double length = Math.pow(temp[0], 2) + Math.pow(temp[1], 2);
            occurrences.put(temp, length);
        }
        PriorityQueue<int[][]> queue = new PriorityQueue<int[][]>(new Comparator<int[][]>() {
            public int compare(int[][] m, int[][] n) {
                return m[1][0] - n[1][0];
            }
        });
        for (Map.Entry<int[], Double> entry : occurrences.entrySet()) {
            int[] num = entry.getKey();
            double count = entry.getValue();
            if (queue.size() == k) {
                if (queue.peek()[1][0] > count) {
                    queue.poll();
                    queue.offer(new int[][]{num, new int[]{(int) count}});
                }
            } else {
                queue.offer(new int[][]{num, new int[]{(int) count}});
            }
        }
        int[][] ret = new int[k][2];
        for (int i = 0; i < k; ++i) {
            ret[i] = queue.poll()[0];
        }
        return ret;
    }
}
