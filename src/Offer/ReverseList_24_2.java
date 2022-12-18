package Offer;


public class ReverseList_24_2 {
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
        reverseList(a);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode front = head, p = head.next, succ = null;
        while (p != null) {
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        head.next = null;
        return front;
    }
}
