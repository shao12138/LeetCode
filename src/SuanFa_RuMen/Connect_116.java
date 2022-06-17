package SuanFa_RuMen;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Connect_116 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        connect(node1);
    }

    public static Node connect(Node root) {
        if (root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList();
        Queue<Node> queue2 = new LinkedList();
        queue.offer(root);
        queue2.offer(root);
        while (!queue2.isEmpty()) {
            Node temp = queue2.poll();
            Node left = temp.left;
            Node right = temp.right;
            if (left != null) {
                queue.offer(left);
                queue.offer(right);
                queue2.offer(left);
                queue2.offer(right);
            }
        }
        int middle = 1;
        int length = queue.size();
        for (int i = 1; i <= length; i++) {
            if (!queue.isEmpty()) {
                Node temp = queue.poll();
                if (i == middle) {
                    temp.next = null;
                    middle = 2 * middle + 1;
                } else {
                    temp.next = queue.peek();
                }
            } else {
                break;
            }
        }
        return root;
    }
}

