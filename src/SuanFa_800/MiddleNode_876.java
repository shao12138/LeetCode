package SuanFa_800;

public class MiddleNode_876 {
    public ListNode middleNode(ListNode head) {
        int lenght = 0;
        ListNode index = head;
        while (index.next != null) {
            lenght++;
            index = index.next;
        }
        for (int i=0;i<lenght/2;i++){
            head = head.next;
        }
        if (lenght%2==0){
            head = head.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}