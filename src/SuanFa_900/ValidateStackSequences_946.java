package SuanFa_900;

import java.util.Stack;

public class ValidateStackSequences_946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int length = popped.length;
        int j = 0;
        for (int i = 0; i < length; i++) {
            int temp = popped[i];
            if (!stack.contains(temp)) {
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
