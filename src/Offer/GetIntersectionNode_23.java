package Offer;

import java.util.ArrayList;

public class GetIntersectionNode_23 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        ArrayList arrayList = new ArrayList();
        while (p!=null){
            arrayList.add(p.hashCode());
            p = p.next;
        }
        while (q!=null){
            if (arrayList.contains(q.hashCode())){
                return q;
            }else {
                q = q.next;
            }
        }
        return null;
    }
}
