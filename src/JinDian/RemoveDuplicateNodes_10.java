package JinDian;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodes_10 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        removeDuplicateNodes(a);
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        Set<Integer> set = new HashSet<Integer>();
        set.add(p.val);
        while (p != null && p.next != null) {
            if (set.contains(p.next.val)) {
                p.next = p.next.next;
            } else {
                set.add(p.next.val);
                p = p.next;
            }
        }
        return head;
    }
}
