package Offer;

import java.util.Stack;

public class ValidateStackSequences_31 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 1, 0};
        int[] b = new int[]{1, 2, 0};
        validateStackSequences(a, b);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int length = popped.length;
        int j = 0;
        for (int i = 0; i < length; i++) {
            int temp = popped[i];
            if (!stack.contains(temp)){
                for (; j < length; j++) {
                    stack.push(pushed[j]);
                    if (pushed[j] == temp) {
                        j++;
                        break;
                    }
                }
            }
            if (stack.peek() == temp) {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
