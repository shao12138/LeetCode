package Offer;

import java.util.Stack;

public class CQueue_9 {
    Stack<Integer> a;
    Stack<Integer> b;

    public CQueue_9() {
        a = new Stack();
        b = new Stack();
    }

    public void appendTail(int value) {
        a.add(value);
    }

    public int deleteHead() {
        if (!b.isEmpty()) {
            return b.pop();
        } else {
            if (a.isEmpty()) {
                return -1;
            }
            while (!a.isEmpty()) {
                b.add(a.pop());
            }
            return b.pop();
        }
    }
}
