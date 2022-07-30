package SuanFa_RuMen;

import java.util.ArrayList;

public class DeleteDuplicates_83 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        a.next = b;
        b.next = c;
//        c.next = d;
//        d.next = e;
        deleteDuplicates(a);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
