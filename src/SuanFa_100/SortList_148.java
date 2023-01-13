package SuanFa_100;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortList_148 {
    public ListNode sortList(ListNode head) {
        Queue<ListNode> que = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.val, o2.val));

        while (head != null) {
            que.add(head);
            head = head.next;
        }

        head = new ListNode();
        ListNode tail = head;
        while (!que.isEmpty()) {
            tail.next = que.poll();
            tail = tail.next;
        }
        tail.next = null;
        return head.next;
    }
}
