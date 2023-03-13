package JinDian;

public class CanPermutePalindrome_4 {
    public static void main(String[] args) {
        String s = "aaa";
        canPermutePalindrome(s);
    }

    public static boolean canPermutePalindrome(String s) {
        int[] c = new int[95];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - '!']++;
        }
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 != 0) {
                count++;
                if (count >= 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
