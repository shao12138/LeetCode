package Offer;


import java.util.Stack;

class Node2 {
    public int val;
    public Node2 prev;
    public Node2 next;
    public Node2 child;

    public Node2(int val) {
        this.val = val;
    }
}

public class Flatten_28 {

    public static void main(String[] args) {
        Node2 a = new Node2(1);
        Node2 b = new Node2(2);
        Node2 c = new Node2(3);
        a.next = b;
        b.prev = a;
        a.child = c;
        flatten(a);
    }

    public static Node2 flatten(Node2 head) {
        if (head == null) {
            return null;
        }
        Stack<Node2> db = new Stack<>();
        Node2 index = head;
        while (index != null) {
            if (index.child != null) {
                if (index.next != null) {
                    index.next.prev = null;
                    db.push(index.next);
                }
                index.next = index.child;
                index.child.prev = index;
                index.child = null;
            }
            if (index.next == null) {
                break;
            } else {
                index = index.next;
            }
        }
        while (!db.isEmpty()) {
            Node2 temp = db.pop();
            index.next = temp;
            temp.prev = index;
            while (index.next != null) {
                index = index.next;
            }
        }
        return head;
    }
}
