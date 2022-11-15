package Offer;

public class MergeTwoLists_25 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        mergeTwoLists(a1, b1);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode head = p;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    p.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    p.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                p = p.next;
            }
            if (l1 == null && l2 != null) {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
            }
            if (l1 != null && l2 == null) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
            }
        }
        return head.next;
    }
}
