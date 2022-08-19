package SuanFa_100;

import java.util.ArrayList;

public class MinStack_155 {
    int result[] = new int[30000];
    int index = 0;

    public MinStack_155() {
    }

    public void push(int val) {
        result[index] = val;
        index++;
    }

    public void pop() {
        result[index - 1] = Integer.MAX_VALUE;
        index--;
    }

    public int top() {
        return result[index - 1];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            min = Integer.min(min, result[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack_155 a = new MinStack_155();
        a.push(1);
        a.push(2);
        System.out.println(a.top());
        System.out.println(a.getMin());
        a.pop();
        System.out.println(a.getMin());
        System.out.println(a.top());
    }
}
