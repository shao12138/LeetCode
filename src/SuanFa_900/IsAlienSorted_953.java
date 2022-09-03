package SuanFa_900;

import java.util.Arrays;
import java.util.Comparator;

public class IsAlienSorted_953 {
    public static void main(String[] args) {
        String[] str = new String[]{"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        isAlienSorted(str, order);
    }

    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            String o1 = words[i];
            String o2 = words[i + 1];
            int count = 0;
            for (int j = 0; j < o1.length() && j < o2.length(); j++) {
                char c1 = o1.charAt(j);
                char c2 = o2.charAt(j);
                if (c1 != c2) {
                    if (order.indexOf(c1) >= order.indexOf(c2)) {
                        return false;
                    }else {
                        break;
                    }
                } else {
                    count++;
                }
            }
            if (count == Math.min(o1.length(), o2.length())) {
                if (o1.length() > o2.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
