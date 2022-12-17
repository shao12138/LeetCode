package Offer;

public class RemoveNthFromEnd_21 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        removeNthFromEnd(a, 5);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int length = 0;
        while (p != null) {
            length++;
            p = p.next;
        }
        if (n == length) {
            return head.next;
        }
        ListNode q = head;
        for (int i = 0; i < length - n - 1; i++) {
            q = q.next;
        }
        if (q.next != null) {
            q.next = q.next.next;
        }
        return head;
    }
}
