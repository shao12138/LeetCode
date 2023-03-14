package SuanFa_1;

public class Partition_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode min = new ListNode(101);
        ListNode max = new ListNode(101);
        ListNode min2 = min;
        ListNode max2 = max;
        while (p != null) {
            if (p.val < x) {
                min.next = new ListNode(p.val);
                min = min.next;
            } else {
                max.next = new ListNode(p.val);
                max = max.next;
            }
            p = p.next;
        }
        ListNode q = min2;
        while (q.next != null) {
            q = q.next;
        }
        q.next = max2.next;
        return min2.next;
    }
}
