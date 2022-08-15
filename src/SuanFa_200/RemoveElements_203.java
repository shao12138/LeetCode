package SuanFa_200;

import SuanFa_800.ListNode;

public class RemoveElements_203 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(7);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(7);
        ListNode e = new ListNode(7);
        ListNode f = new ListNode(7);
        ListNode g = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        removeElements(a, 7);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode p = head;
        while (head != null &&head.val == val) {
            head = head.next;
        }
        while (p != null && p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return head;
    }
}
