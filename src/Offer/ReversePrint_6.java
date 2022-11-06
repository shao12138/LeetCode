package Offer;

import java.util.ArrayList;

public class ReversePrint_6 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(arrayList.size() - i - 1);
        }
        return result;
    }
}
