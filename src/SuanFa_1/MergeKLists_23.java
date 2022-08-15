package SuanFa_1;

import SuanFa_800.ListNode;

public class MergeKLists_23 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(-2);
        ListNode a2 = new ListNode(-3);
        ListNode a3 = new ListNode(-2);
        ListNode a4 = new ListNode(1);
        a2.next = a3;
        a3.next = a4;
        ListNode[] a = new ListNode[]{null, a1, a2};
        mergeKLists(a);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for (int i = 0; i < lists.length; i++) {
            result = mergeTwoLists(lists[i], result);
        }
        return result;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val >= list2.val) {
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
