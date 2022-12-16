package Offer;

public class CountSubstrings_20 {
    public static void main(String[] args) {
        String t = "aaa";
        countSubstrings(t);
    }

    public static int countSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int sum1 = hui(s, i, i);
            int sum2 = hui(s, i, i + 1);
            sum += sum1 + sum2;
        }
        return sum;
    }

    public static int hui(String s, int left, int right) {
        int sum = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
            sum++;
        }
        return sum;
    }
}
