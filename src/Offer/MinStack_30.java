package Offer;

public class MinStack_30 {
    int[] result = new int[20000];
    int index = -1;
    public MinStack_30() {

    }

    public void push(int x) {
        index++;
        result[index] = x;
    }

    public void pop() {
        index--;
    }

    public int top() {
        return result[index--];
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= index; i++) {
            min = Math.min(result[i], min);
        }
        return min;
    }
}
