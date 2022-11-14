package Offer;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString_48 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set temp = new HashSet();
            temp.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!temp.contains(s.charAt(j))) {
                    temp.add(s.charAt(j));
                } else {
                    break;
                }
            }
            max = Math.max(max, temp.size());
        }
        return max;
    }
}
