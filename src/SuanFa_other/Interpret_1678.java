package SuanFa_other;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interpret_1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        Queue queue = new LinkedList();
        String result = "";
        for (int i = 0; i < command.length(); i++) {
            char temp = command.charAt(i);
            if (temp == 'G') {
                result += "G";
            } else if (temp == '(') {

            } else if (temp == ')') {
                if (queue.isEmpty()) {
                    result += "o";
                } else {
                    while (!queue.isEmpty()) {
                        result += queue.poll();
                    }
                }
            } else {
                queue.offer(temp);
            }
        }
        return result;
    }
}
