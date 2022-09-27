package SuanFa_600;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindClosestElements_658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() == k) {
                if (Math.abs(queue.peek()-x) > Math.abs(arr[i] - x)) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            } else {
                queue.offer(arr[i]);
            }
        }
        ArrayList result = new ArrayList();
        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
}
