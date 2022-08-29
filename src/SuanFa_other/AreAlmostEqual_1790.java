package SuanFa_other;

import java.util.Arrays;

public class AreAlmostEqual_1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int count = 0;
        int[] index = new int[2];
        int j=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                index[j]=i;
                j=1;
            }

            if (count > 2) {
                return false;
            }
        }
        if (count==2){
            return s1.charAt(index[0])==s2.charAt(index[1])&&s1.charAt(index[1])==s2.charAt(index[0]);
        }
        return false;
    }
}
