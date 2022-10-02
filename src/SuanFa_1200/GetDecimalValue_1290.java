package SuanFa_1200;


public class GetDecimalValue_1290 {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
