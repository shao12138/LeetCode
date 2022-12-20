package Offer;

public class IsPalindrome_27 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        isPalindrome(a);
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        String a = "";
        while (head != null) {
            a += head.val;
            head = head.next;
        }
        return huiwen(a);
    }

    public static boolean huiwen(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left >= 0 && right < s.length() && left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        return right <= left;
    }
}
