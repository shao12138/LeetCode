package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams_15 {
    public List<Integer> findAnagrams(String s, String p) {
        List a = new ArrayList<>();
        int length = p.length();
        for (int i = 0; i <= s.length() - length; i++) {
            String newString = s.substring(i, i+length);
            if (pi(newString, p)) {
                a.add(i);
            }
        }
        return a;
    }

    public static boolean pi(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = n; i < m; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];
            --cnt2[s2.charAt(i - n) - 'a'];
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;
    }
}
