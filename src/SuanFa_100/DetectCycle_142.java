package SuanFa_100;

import SuanFa_800.ListNode;

import java.util.ArrayList;

public class DetectCycle_142 {
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
