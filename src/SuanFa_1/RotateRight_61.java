package SuanFa_1;

public class RotateRight_61 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
        rotateRight(a, 1);

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        temp.next = head;
        ListNode start = head;
        ListNode result = new ListNode();
        for (int i = 0; i < length-k; i++) {
            if (i == k % length) {
                result = start.next;
                start.next = null;
            } else {
                start = start.next;
            }
        }
        return result;
    }
}
