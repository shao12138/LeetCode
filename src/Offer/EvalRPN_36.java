package Offer;

import java.util.Stack;

public class EvalRPN_36 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); //操作数栈，链式栈
        int value = 0;
        for (int i = 0; i < tokens.length; i++) {            //逐个检查后缀表达式中的字符
            String ch = tokens[i];
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")) {                       //遇到数字字符
                value = Integer.parseInt(ch);
                stack.push(value);                         //new Integer(value)整数对象入栈，Java自动将int整数封装成Integer对象
            } else {
                int y = stack.pop(), x = stack.pop();      //出栈两个操作数，注意出栈次序。Java自动调用intValue()方法将Integer对象转换成int整数
                switch (ch) {                           //根据运算符分别计算
                    case "+":
                        value = x + y;
                        break;
                    case "-":
                        value = x - y;
                        break;
                    case "*":
                        value = x * y;
                        break;
                    case "/":
                        value = x / y;
                        break;
                }
                System.out.print(x + (ch + "") + y + "=" + value + "，");//显示运算过程
                stack.push(value);                     //运算结果入栈
            }
        }
        return stack.pop();
    }
}
