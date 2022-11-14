package Offer;

public class DeleteNode_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val){
            head = head.next;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
