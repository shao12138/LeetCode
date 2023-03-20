package JinDian;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates_20 {
    private ArrayList<Stack<Integer>> stacks;
    private int capacity;

    public StackOfPlates_20(int cap) {
        stacks = new ArrayList<>();
        capacity = cap;
    }

    public void push(int val) {
        if (capacity <= 0) {
            return;
        }
        Stack<Integer> lastStack = getLastStack();
        if (lastStack != null && lastStack.size() < capacity) {
            lastStack.push(val);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(val);
            stacks.add(newStack);
        }
    }

    public int pop() {
        return popAt(stacks.size() - 1);
    }

    public int popAt(int index) {
        if (index < 0 || index >= stacks.size()) {
            return -1;
        }
        Stack<Integer> stack = stacks.get(index);
        if (stack.isEmpty()) {
            return -1;
        }
        int value = stack.pop();
        if (stack.isEmpty()) {
            stacks.remove(index);
        }
        return value;
    }

    private Stack<Integer> getLastStack() {
        if (stacks.isEmpty()) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }
}
