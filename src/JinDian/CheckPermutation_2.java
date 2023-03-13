package JinDian;

import java.util.Arrays;

public class CheckPermutation_2 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] t1 = new int[c1.length];
        int[] t2 = new int[c2.length];
        for (int i = 0; i < c1.length; i++) {
            t1[i] = c1[i] - 'a';
            t2[i] = c2[i] - 'a';
        }
        Arrays.sort(t1);
        Arrays.sort(t2);
        return Arrays.equals(t1, t2);
    }
}
