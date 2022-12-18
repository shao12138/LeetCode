package Offer;



public class ReverseList_24 {
    public ListNode reverseList(ListNode head) {
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
