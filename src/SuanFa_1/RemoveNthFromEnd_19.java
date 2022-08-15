package SuanFa_1;

import SuanFa_800.ListNode;

public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lenght = 0;
        ListNode count = head;
        while (count != null) {
            lenght++;
            if (count.next!=null){
                count = count.next;
            }else {
                break;
            }
        }

        ListNode index = head;
        for (int i = 1; i < lenght - n; i++) {
            index = index.next;
        }
        index.next = index.next.next;
        return head;
    }
}