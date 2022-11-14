package Offer;

import java.util.HashMap;

public class GetKthFromEnd_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        HashMap<Integer, ListNode> hashMap = new HashMap<>();
        ListNode p = head;
        Integer index = 1;
        while (p != null) {
            hashMap.put(index, p);
            p = p.next;
            index++;
        }
        return hashMap.get(hashMap.size() - k);
    }
}
