package JinDian;

public class IsPalindrome_15 {
    public boolean isPalindrome(ListNode head) {
        String a = "";
        while (head != null) {
            a += head.val + " ";
            head = head.next;
        }
        return huiwen(a);
    }

    public boolean huiwen(String s) {
        String[] t = s.split(" ");
        int left = 0;
        int right = t.length - 1;
        while (left >= 0 && right < s.length() && left < right && t[left].equals(t[right])) {
            left++;
            right--;
        }
        return right <= left;
    }
}
