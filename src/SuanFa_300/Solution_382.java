package SuanFa_300;

import java.util.ArrayList;
import java.util.Random;

public class Solution_382 {
    ArrayList<Integer> arrayList = new ArrayList();

    public Solution_382(ListNode head) {
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        int index = new Random().nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
