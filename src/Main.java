// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

public class Main {
    public static ListNode reorderList(ListNode head) {
        ListNode p = head;
        ListNode q = p;
        if (p == null) {
            return null;
        }
        ListNode a = p;
        ListNode b = p.next;
        ListNode c = null;
        ListNode d = null;
        p = p.next;
        while (p.next != null) {
            c = p.next;
            d = p.next.next;
            b.next = d.next;
            d.next = a;
            a = b.next;
            b = b.next;
            p = b.next;
        }
        return q;
    }

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
        reorderList(a);
    }
}