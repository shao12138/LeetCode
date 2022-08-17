package SuanFa_700;

public class MyLinkedList_707 {
    ListNode head;
    int length = 0;

    public MyLinkedList_707() {
        head = null;
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        ListNode result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
            if (result==null){
                return -1;
            }
        }
        System.out.println(result.val);
        return result.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        if (head==null){
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index==0){
            addAtHead(val);
        }
        if (index > 0 && index <= length) {
            ListNode result = head;
            for (int i = 0; i < index - 1; i++) {
                result = result.next;
            }
            ListNode newNode = new ListNode(val);
            newNode.next = result.next;
            result.next = newNode;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
        }
        if (index > 0 && index < length) {
            ListNode result = head;
            for (int i = 0; i < index - 1; i++) {
                result = result.next;
            }
            result.next = result.next.next;
            length--;
        }
    }

    public static void main(String[] args) {
        MyLinkedList_707 linkedList = new MyLinkedList_707();
        linkedList.addAtTail(1);
        linkedList.addAtTail(3);
        linkedList.get(1);
    }
}
