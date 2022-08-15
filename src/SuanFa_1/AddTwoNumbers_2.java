package SuanFa_1;

import SuanFa_800.ListNode;

import java.util.Stack;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(4);
        e.next = f;
        f.next = g;
        addTwoNumbers(a, e);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = "";
        String str2 = "";
        while (l1 != null) {
            str1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            str2 += l2.val;
            l2 = l2.next;
        }
        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();
        String s = addStrings(str1,str2);
        ListNode root = new ListNode(s.charAt(s.length() - 1) - '0');
        ListNode p = root;
        for (int i = s.length() - 2; i >= 0; i--) {
            p.next = new ListNode(s.charAt(i) - '0');
            p = p.next;
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
