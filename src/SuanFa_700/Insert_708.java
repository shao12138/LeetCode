package SuanFa_700;


public class Insert_708 {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        a.next = b;
        b.next = c;
        c.next = a;
        insert(a, 6);
    }

    public static Node insert(Node head, int insertVal) {
        Node p = head;
        if (p == null) {
            Node result = new Node(insertVal);
            result.next = result;
            return result;
        }
        while (p.next.val >= p.val) {
            if (p.next == head) {
                break;
            }
            p = p.next;
        }
        Node q = p.next;
        Node x = new Node(insertVal);
        if (q.next == q) {
            x.next = q.next;
            q.next = x;
            return head;
        }
        while (q != q.next) {
            if (q.val <= insertVal && q.next.val >= insertVal) {
                x.next = q.next;
                q.next = x;
                break;
            } else if (q.val > insertVal || insertVal > p.val) {
                x.next = q;
                p.next = x;
                break;
            }
            q = q.next;
        }
        return head;
    }
}
