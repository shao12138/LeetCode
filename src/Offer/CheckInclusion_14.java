package Offer;

import java.util.Arrays;

public class CheckInclusion_14 {
    public boolean checkInclusion(String s1, String s2) {
        int length = s1.length();
        String middle = "";
        for (int i = 0; i <= s2.length() - length; i++) {
            middle = s2.substring(i, i + length);
            char[] a1 = s1.toCharArray();
            char[] a2 = middle.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            int count = 0;
            for (int j = 0; j < a1.length; j++) {
                if (a1[j] != a2[j]) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == a1.length) {
                return true;
            }
        }
        return false;
    }
}
