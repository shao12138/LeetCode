package SuanFa_other;

import java.util.Stack;

public class MinRemoveToMakeValid_1249 {
    public static void main(String[] args) {
        String str = "())()(((";
        System.out.println(minRemoveToMakeValid(str));
    }

    public static String minRemoveToMakeValid(String s) {
        String result = "";
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                result += '(';
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if (stack.pop() == '(') {
                        result += ')';
                    }
                }
            } else {
                result += s.charAt(i);
            }
        }
        if (!stack.isEmpty() && !result.equals("")) {
            String newresult = "";
            stack = new Stack();
            for (int i = result.length() - 1; i >= 0; i--) {
                if (result.charAt(i) == ')') {
                    stack.push(')');
                    newresult += ')';
                } else if (result.charAt(i) == '(') {
                    if (!stack.isEmpty()) {
                        if (stack.pop() == ')') {
                            newresult += '(';
                        }
                    }
                } else {
                    newresult += result.charAt(i);
                }
            }
            return new StringBuffer(newresult).reverse().toString();
        } else {
            return result;
        }
    }
}
