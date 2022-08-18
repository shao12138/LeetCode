package SuanFa_100;

import java.util.Stack;

public class ReorderList_143 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        reorderList(a);
    }

    public static void reorderList(ListNode head) {
        if (head.next == null) return;
        //分成前后两个部分
        ListNode mid = getMid(head);
        ListNode temp = mid.next;
        mid.next = null;
        //head是前，temp是后
        temp = reverse(temp);
        merge(head, temp);
    }

    public static void merge(ListNode head, ListNode temp) {
        ListNode p = head;
        while (temp != null && p != null) {
            ListNode q = temp;
            temp = temp.next;
            q.next = p.next;
            p.next = q;
            p = p.next.next;
        }
    }

    //快慢指针找到中点切割
    public static ListNode getMid(ListNode head) {
        if (head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }

    //翻转链表
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        ListNode pre = reverse(head.next);
        temp.next = head;
        head.next = null;
        return pre;
    }
}
