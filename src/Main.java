import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String a = "";
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for (Character c : str.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                stack_multi.add(Integer.parseInt(a));
                stack_res.add(c.toString());
                a = "";
            } else {
                a += c;
            }
        }
        String result = "";
        for (int i = 0; i < stack_res.size(); i++) {
            for (int j = 0; j < stack_multi.get(i); j++) {
                result += stack_res.get(i);
            }
        }

        System.out.println(result);
    }
}