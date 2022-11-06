package Offer;

import java.util.HashMap;

public class CopyRandomList_35 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node root = new Node(head.val);
        Node left = head;
        Node right = root;
        HashMap<Integer, Integer> hashMap = new HashMap();
        int index = 0;
        while (left != null) {
            if (left.next == null) {
                right.next = null;
            } else {
                right.next = new Node(left.next.val);
            }
            Node r = left.random;
            Node s = head;
            for (int i = 0; ; i++) {
                if (r == null) {
                    hashMap.put(index, -1);
                    break;
                }
                if (s != null && r != null && s.hashCode() == r.hashCode()) {
                    hashMap.put(index, i);
                    break;
                }
                s = s.next;
            }
            index++;
            left = left.next;
            right = right.next;
        }
        right = root;
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i) == -1) {
                right.random = null;
            } else {
                Node temp = root;
                for (int j = 0; j < hashMap.get(i); j++) {
                    temp = temp.next;
                }
                right.random = temp;
            }
            right = right.next;
        }
        return root;
    }
}
