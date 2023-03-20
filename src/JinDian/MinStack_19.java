package JinDian;

public class MinStack_19 {
    int result[] = new int[30000];
    int index = 0;

    public MinStack_19() {
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
}
