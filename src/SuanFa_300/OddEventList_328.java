package SuanFa_300;

import java.util.LinkedList;
import java.util.Queue;

public class OddEventList_328 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        oddEvenList(a);

    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        Queue<ListNode> queue = new LinkedList();
        ListNode p = head;
        ListNode q = head;
        int index = 1;
        while (p.next != null) {
            if (index % 2 == 0) {
                queue.add(p);
                q.next = q.next.next;
            }
            index++;
            q = p;
            p = p.next;
        }
        if (index % 2 == 0) {
            q.next = q.next.next;
            queue.add(p);
            p = q;
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p.next.next = null;
            p = p.next;
        }
        return head;
    }
}
