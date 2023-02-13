package SuanFa_300;

public class IsSubsequence_392 {
    public static boolean isSubsequence(String s, String t) {
        int j = -1;
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = t.indexOf(c, j + 1);
            if (temp == -1) {
                return false;
            }
            if (temp == j) {
                j++;
            } else {
                j = temp;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "ahbgdc";
        isSubsequence(a, b);
    }
}
