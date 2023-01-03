package Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest_59 {
    PriorityQueue<Integer> minHeap = null;
    int index = 0;
    int max = 0;
    public KthLargest_59(int k, int[] nums) {
        int len = nums.length;
        max = k;
        minHeap = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        for (int i = 0; i < k && i < nums.length && len != 0; i++) {
            minHeap.offer(nums[i]);
            index++;
        }
        for (int i = k; i < len; i++) {
            index++;
            Integer topElement = minHeap.peek();
            if (nums[i] > topElement) {
                index--;
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
    }

    public int add(int val) {
        Integer topElement = minHeap.peek();
        if (index < max || topElement == null) {
            minHeap.offer(val);
            index++;
        } else {
            if (val > topElement) {
                minHeap.poll();
                minHeap.offer(val);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargest_59 a = new KthLargest_59(2, new int[]{0});
        a.add(-1);
        a.add(1);
        a.add(-2);
        a.add(-4);
        a.add(3);
    }
}
