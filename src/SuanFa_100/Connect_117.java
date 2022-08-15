package SuanFa_100;

import java.util.*;

class Connect_117 {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        Node a7 = new Node(7);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.right = a7;
        connect(a1);
    }

    public static Node connect(Node root) {
        if (root == null) {
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
                queue2.offer(left);
            }
            if (right != null) {
                queue.offer(right);
                queue2.offer(right);
            }
        }
        Queue<Node> queue3 = new LinkedList<>();//队列里面存放结点
        List<Integer> result = new ArrayList<Integer>();
        queue3.offer(root);//根节点先入队
        //只要队列非空就一直循环;
        while (!queue3.isEmpty()) {
            int levelNum = queue3.size();//获取当前层的节点数.
            result.add(levelNum);
            //遍历当前层结点
            for (int i = 0; i < levelNum; i++) {
                //队首出队并将value加入子list
                Node node = queue3.poll();
                if (node.left != null) {//如果队首的左结点不为空就把左结点入队
                    queue3.offer(node.left);
                }
                if (node.right != null) {//如果队首的右结点不为空就把右结点入队
                    queue3.offer(node.right);
                }
            }
        }
        for (int i = 1; i < result.size(); i++) {
            result.set(i, result.get(i) + result.get(i - 1));
        }
        int length = queue.size();
        int j = 0;
        for (int i = 1; i <= length; i++) {
            if (!queue.isEmpty()) {
                Node temp = queue.poll();
                if (i == result.get(j)) {
                    j++;
                    temp.next = null;
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