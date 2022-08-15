package SuanFa_1;

import java.util.ArrayList;
import java.util.Stack;

public class Multiply_43 {
    public static void main(String[] args) {
        String num1 = "9133";
        String num2 = "0";
        System.out.println(multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0")){
            return "0";
        }
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        ArrayList<String> result = new ArrayList();
        for (int i = num1.length() - 1; i >= 0; i--) {
            String temp = "";
            String pre = "";
            boolean flag = false;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int a = (c1[i] - '0') * (c2[j] - '0');
                if (flag) {
                    a += Integer.parseInt(pre);
                }
                if (a >= 10) {
                    temp += a % 10;
                    pre = a / 10 + "";
                    flag = true;
                } else {
                    temp += a;
                    flag = false;
                }
            }
            if (flag == true) {
                temp += pre;
            }
            result.add(new StringBuffer(temp).reverse().toString());
        }
        String zero = "";
        for (int k = 0; k < result.size(); k++) {
            result.set(k, result.get(k) + zero);
            zero += "0";
        }
        String finallyResult = "0";
        for (int k = 0; k < result.size(); k++) {
            finallyResult = addStrings(finallyResult, result.get(k));
        }
        return finallyResult;
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