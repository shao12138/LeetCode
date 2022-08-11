package SuanFa_RuMen;

import java.util.Arrays;
import java.util.Stack;

public class AddStrings_415 {
    public static void main(String[] args) {
        String s = "11";
        String m = "123";
        System.out.println(addStrings(s, m));
    }

    public static String addStrings(String num1, String num2) {
        int length = Math.max(num1.length(), num2.length());
        Stack<Character> s1 = new Stack();
        Stack<Character> s2 = new Stack();
        for (int i = 0; i < num1.length(); i++) {
            s1.push(num1.charAt(i));
        }
        for (int i = 0; i < num2.length(); i++) {
            s2.push(num2.charAt(i));
        }
        String result = "";
        boolean flag = false;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty() && !s2.isEmpty()) {
                int a = (s2.pop() + s1.pop()) - '0' - '0';
                if (flag) {
                    a++;
                }
                if (a >= 10) {
                    result += a % 10;
                    flag = true;
                } else {
                    result += a;
                    flag = false;
                }
            } else if (s1.isEmpty()) {
                int a = s2.pop() - '0';
                if (flag) {
                    a++;
                }
                if (a >= 10) {
                    result += a % 10;
                    flag = true;
                } else {
                    result += a;
                    flag = false;
                }
            } else if (s2.isEmpty()) {
                int a = s1.pop() - '0';
                if (flag) {
                    a++;
                }
                if (a >= 10) {
                    result += a % 10;
                    flag = true;
                } else {
                    result += a;
                    flag = false;
                }
            }
        }
        if (flag == true) {
            result += 1;
        }
        return new StringBuffer(result).reverse().toString();
    }
}
