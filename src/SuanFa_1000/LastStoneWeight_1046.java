package SuanFa_1000;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight_1046 {
    public static void main(String[] args) {
        int[] x = new int[]{2, 7, 4, 1, 8, 1};
        lastStoneWeight(x);
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer m, Integer n) {
                return n - m;
            }
        });
        for (int x : stones) {
            queue.add(x);
        }
        while (queue.size() != 1) {
            queue.add(queue.poll() - queue.poll());
        }
        return queue.poll();
    }
}
