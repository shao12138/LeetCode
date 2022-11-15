package Offer;

public class GetIntersectionNode_52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            lengthA++;
            a = a.next;
        }
        while (b != null) {
            lengthB++;
            b = b.next;
        }
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                headA = headA.next;
            }
        }
        if (lengthB > lengthA) {
            for (int i = 0; i < lengthB - lengthA; i++) {
                headB = headB.next;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA == null? null : headA;
    }
}
