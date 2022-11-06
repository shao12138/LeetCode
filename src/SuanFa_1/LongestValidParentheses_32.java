package SuanFa_1;

import java.util.ArrayList;
import java.util.Stack;

public class LongestValidParentheses_32 {
    public static void main(String[] args) {
        String s = "(()";
        longestValidParentheses(s);
    }

    public static int longestValidParentheses(String s) {
        char[] t = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        ArrayList<Integer> arrayList = new ArrayList();
        for (char c : t) {
            if (c == '(') {
                stack.add('(');
                arrayList.add(1);
            } else if (!stack.isEmpty()) {
                char temp = stack.pop();
                if (temp == '(') {
                    arrayList.add(0);
                    arrayList.set(arrayList.lastIndexOf(1), 0);
                }
            } else {
                arrayList.add(1);
            }
        }
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 0) {
                temp++;
            } else {
                temp = 0;
            }
            sum = Math.max(temp, sum);
        }
        return sum;
    }
}
