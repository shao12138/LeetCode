package SuanFa_200;

import java.util.Stack;

public class MyQueue_232 {
    Stack<Integer> a = null;
    Stack<Integer> b = null;

    public MyQueue_232() {
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
        return b.pop();
    }

    public boolean empty() {
        return a.isEmpty()&& b.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue_232 a = new MyQueue_232();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());
        a.push(5);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
