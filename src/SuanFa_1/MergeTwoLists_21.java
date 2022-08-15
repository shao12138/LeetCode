package SuanFa_1;

import SuanFa_800.ListNode;

public class MergeTwoLists_21 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        mergeTwoLists(a1, b1);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }else if (list1.val >= list2.val) {
            result = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            result = new ListNode(list1.val);
            list1 = list1.next;
        }
        ListNode temp = result;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                list2 = null;
            } else if (list2 == null) {
                temp.next = list1;
                list1 = null;
            } else if (list1.val >= list2.val) {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            } else {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }

        }
        return result;
    }
}
