package Offer;

public class FirstUniqChar_50 {
    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar(s);
    }

    public static char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.lastIndexOf(c) == i && s.indexOf(c) == i) {
                return c;
            }
        }
        return ' ';
    }
}
