package JinDian;

public class KthToLast_11 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        kthToLast(a, 2);
    }

    public static int kthToLast(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        int i = 0;
        while (p != null) {
            if (i >= k) {
                q = q.next;
            }
            p = p.next;
            i++;
        }
        return q.val;
    }
}
