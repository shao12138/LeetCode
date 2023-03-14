package JinDian;

public class Partition_13 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next =d;
        d.next = e;
        e.next = f;
        partition(a,3);
    }
    public static ListNode partition(ListNode head, int x) {
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
