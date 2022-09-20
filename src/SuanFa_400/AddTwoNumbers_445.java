package SuanFa_400;

import java.util.Stack;

public class AddTwoNumbers_445 {
    public static void main(String[] args) {
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(4);
        e.next = f;
        f.next = g;
        addTwoNumbers(a, e);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String number1 = "";
        String number2 = "";
        while (l1 != null) {
            number1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            number2 += l2.val;
            l2 = l2.next;
        }
        String result = addStrings(number1,number2);
        ListNode root = new ListNode(result.charAt(0) - '0');
        ListNode index = root;
        for (int i = 1; i < result.length(); i++) {
            index.next = new ListNode(result.charAt(i) - '0');
            index = index.next;
        }
        return root;
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
