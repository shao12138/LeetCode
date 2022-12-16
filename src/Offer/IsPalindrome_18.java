package Offer;

public class IsPalindrome_18 {
    public static void main(String[] args) {
        String s = "ab@a";
        isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                temp += c;
            }
        }
        temp = temp.toLowerCase();
        temp = temp.replaceAll(" ", "");
        int left = 0;
        int right = temp.length() - 1;
        while (left >= 0 && right < temp.length() && left < right) {
            if (temp.charAt(left) != temp.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
