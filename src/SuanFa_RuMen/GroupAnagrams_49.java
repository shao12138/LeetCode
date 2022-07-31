package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List a = new ArrayList();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != "0") {
                ArrayList b = new ArrayList();
                b.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != "0") {
                        if (isAnagram(strs[i], strs[j])) {
                            b.add(strs[j]);
                            strs[j] = "0";
                        }
                    }
                }
                if (b.size() != 0) {
                    a.add(b);
                }
            }
        }
        return a;
    }

    public static boolean isAnagram(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m || m > n) {
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
