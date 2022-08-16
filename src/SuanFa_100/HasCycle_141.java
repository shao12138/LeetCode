package SuanFa_100;

import java.util.ArrayList;

public class HasCycle_141 {
    public boolean hasCycle(ListNode head) {
        ArrayList a = new ArrayList();
        ListNode p = head;
        while (p!=null){
            if (a.contains(p.hashCode())){
                return true;
            }else {
                a.add(p.hashCode());
            }
            p = p.next;
        }
        return false;
    }
}
