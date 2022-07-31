package SuanFa_RuMen;

import java.util.Stack;

public class IsValid_20 {
    public static void main(String[] args) {
        String s = "))";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char c[] = s.toCharArray();
        Stack<Character> b = new Stack();
        if (c.length % 2 == 1) {
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                b.add(c[i]);
            } else if (c[i] == ']') {
                if ((b.size() != 0 && b.peek() != '[') || b.size() == 0) {
                    return false;
                } else {
                    b.pop();
                }
            } else if (c[i] == ')') {
                if ((b.size() != 0 && b.peek() != '(') || b.size() == 0) {
                    return false;
                } else {
                    b.pop();
                }
            } else if (c[i] == '}') {
                if ((b.size() != 0 && b.peek() != '{') || b.size() == 0) {
                    return false;
                } else {
                    b.pop();
                }
            }
        }
        if (b.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
