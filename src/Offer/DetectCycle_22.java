package Offer;

import java.util.ArrayList;

public class DetectCycle_22 {
    public ListNode detectCycle(ListNode head) {
        ArrayList a = new ArrayList();
        ListNode p = head;
        while (p != null) {
            if (a.contains(p.hashCode())) {
                return p;
            } else {
                a.add(p.hashCode());
            }
            p = p.next;
        }
        return null;
    }
}
