import java.util.ArrayList;

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

public class Test {
    public String serialize(ListNode head) {

        if (head == null) {
            return "";
        }
        String result = "";
        ListNode p = head;
        ArrayList a = new ArrayList();
        while (p != null) {
            if (a.contains(p.hashCode())) {
                result += ";";
                return result;
            } else {
                result += p.val + ",";
                a.add(p.hashCode());
            }
            p = p.next;
        }
        return result;
    }

    public ListNode unSerialize(String result) {
        if (result.equals("")) {
            return null;
        }
        ListNode head = new ListNode(result.charAt(0));
        ListNode p = head;
        if (result.contains(";")) {
            String[] temp = result.split(",");
            for (int i = 1; i < temp.length - 1; i++) {
                p.next = new ListNode(Integer.parseInt(temp[i]));
                if (i != temp.length - 2) {
                    p = p.next;
                }
            }
            p.next = head;
        } else {
            String[] temp = result.split(",");
            for (int i = 1; i < temp.length - 1; i++) {
                p.next = new ListNode(Integer.parseInt(temp[i]));
                p = p.next;
            }
        }
        return head;
    }
}