package JinDian;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindClosedNumbers_37 {
    public static void main(String[] args) {
        int n = 2147483647;
        findClosedNumbers(n);
    }

    public static int[] findClosedNumbers(int num) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - num) - Math.abs(o2 - num);
            }
        });
        int left = num - 1;
        int right = num + 1;
        int s = Integer.bitCount(num);

        for (int i = 0; i < 10000; i++) {
            int l = Integer.bitCount(left);
            if (s == l) {
                queue.add(left);
            }
            left--;
            if (queue.size() == 1 || left <= 0) {
                break;
            }
        }
        for (int i = 0; i < 10000; i++) {
            int r = Integer.bitCount(right);
            if (s == r) {
                queue.add(right);
            }
            right++;
            if (queue.size() == 2 || right >= 2147483647) {
                break;
            }
        }
        if (queue.size() == 0) {
            return new int[]{-1, -1};
        }else if (queue.size()==1){
            int c = queue.poll();
            if (c>num){
                return new int[]{c,-1};
            }else {
                return new int[]{-1,c};
            }
        }
        int a = queue.poll();
        int b = queue.poll();
        if (a > num && b < num) {
            return new int[]{a, b};
        } else if (a < num && b > num) {
            return new int[]{b, a};
        } else if (a > num && b > num) {
            return new int[]{a, -1};
        } else {
            return new int[]{-1, b};
        }
    }
}
