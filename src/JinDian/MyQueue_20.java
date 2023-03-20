package JinDian;

import java.util.Stack;

public class MyQueue_20 {
    Stack<Integer> a = null;
    Stack<Integer> b = null;

    public MyQueue_20() {
        a = new Stack();
        b = new Stack();
    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public int peek() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }
}
