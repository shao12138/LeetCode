package JinDian;

import java.util.Arrays;

public class SortedStack_22 {
    int result[] = new int[5000];
    int index = 0;

    public SortedStack_22() {
        Arrays.fill(result, -1);
    }

    public void push(int val) {
        result[index] = val;
        index++;
    }

    public void pop() {
        int[] s = getMin();
        result[s[1]] = -1;
        index--;
    }

    public int peek() {
        int[] s = getMin();
        return result[s[1]];
    }

    public int[] getMin() {
        int min = index;
        int in = 0;
        for (int i = 0; i < index; i++) {
            if (min > result[i] && result[i] != -1) {
                min = result[i];
                in = i;
            }
        }
        return new int[]{min, in};
    }

    public boolean isEmpty() {
        for (int i = 0; i < index; i++) {
            if (result[i] != -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SortedStack_22 a = new SortedStack_22();
        a.push(1);
        a.push(2);
        System.out.println(a.peek());
        a.pop();
        System.out.println(a.peek());
    }
}
