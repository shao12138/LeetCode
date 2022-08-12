package SuanFa_RuMen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class WordPattern_290 {
    public static void main(String[] args) {
        String a = "abba";
        String b = "dog dog dog dog";
        wordPattern(a, b);
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        String[] str = s.split(" ");
        char[] c = pattern.toCharArray();
        if (str.length!=c.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                if (!hashMap.get(pattern.charAt(i)).equals(str[i])) {
                    return false;
                }
            } else {
                Collection<String> value = hashMap.values();
                Iterator<String> iterator2 = value.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().equals(str[i])){
                        return false;
                    }
                }
                hashMap.put(pattern.charAt(i), str[i]);
            }
        }
        return true;
    }
}
