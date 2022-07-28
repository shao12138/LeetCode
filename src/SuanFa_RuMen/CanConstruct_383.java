package SuanFa_RuMen;

import java.util.Arrays;

public class CanConstruct_383 {
    public static void main(String[] args) {
        String s1 = "fihjjjjei";
        String s2 = "hjibagacbhadfaefdjaeaebgi";
        canConstruct(s1, s2);
    }

    public static boolean canConstruct(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
        }
        for (int i = 0; i < m; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] > cnt2[i]) {
                return false;
            }
        }
        return true;
    }
}
