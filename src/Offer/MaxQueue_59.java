package Offer;

import java.util.Arrays;

public class MaxQueue_59 {
    int[] queue = new int[10001];
    int front = 0;
    int next = 0;
    int max = -1;

    public MaxQueue_59() {
        Arrays.fill(queue, -1);
    }

    public int max_value() {
        return max;
    }

    public void push_back(int value) {
        queue[next] = value;
        max = Math.max(max, value);
        next++;
    }

    public int pop_front() {
        int temp = queue[front];
        int newMax = -1;
        if (temp!=-1){
            front++;
        }
        if (temp == max) {
            for (int i = front; i < queue.length; i++) {
                newMax = Math.max(newMax, queue[i]);
            }
            max = newMax;
        }
        return temp;
    }

    public static void main(String[] args) {
        MaxQueue_59 maxQueue_59 = new MaxQueue_59();
        System.out.println(maxQueue_59.max_value());
        System.out.println(maxQueue_59.pop_front());
        System.out.println(maxQueue_59.pop_front());
        maxQueue_59.push_back(94);
        maxQueue_59.push_back(16);
        maxQueue_59.push_back(89);
        System.out.println(maxQueue_59.pop_front());
        maxQueue_59.push_back(22);
        System.out.println(maxQueue_59.pop_front());
    }
}
