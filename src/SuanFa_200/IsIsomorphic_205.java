package SuanFa_200;

import java.util.HashMap;

public class IsIsomorphic_205 {
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        HashMap<Character, Character> hashMap = new HashMap<>();
        HashMap<Character, Character> hashMap2 = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char temp = s.charAt(i);
            char temp2 = t.charAt(i);
            if (hashMap.containsKey(temp)) {
                if (hashMap.get(temp) != temp2) {
                    return false;
                }
            } else {
                hashMap.put(temp, temp2);
            }
            if (hashMap2.containsKey(temp2)) {
                if (hashMap2.get(temp2) != temp) {
                    return false;
                }
            } else {
                hashMap2.put(temp2, temp);
            }
        }
        return true;
    }
}
