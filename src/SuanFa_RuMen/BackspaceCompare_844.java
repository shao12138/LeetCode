package SuanFa_RuMen;

import java.util.Stack;

public class BackspaceCompare_844 {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        backspaceCompare(s, t);
    }

    public static boolean backspaceCompare(String s, String t) {
        return trans(s).equals(trans(t));
    }

    public static String trans(String s) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='#'){
                if (!stack1.empty()){
                    stack1.pop();
                }
            }else {
                stack1.push(s.charAt(i));
            }
        }
        //System.out.println(stack1.toString());
        return stack1.toString();
    }
}
