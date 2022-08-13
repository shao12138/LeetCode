package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindRepeatedDnaSequences_187 {
    public static void main(String[] args) {
        String s = "AAAAAAAAAA";
        findRepeatedDnaSequences(s);
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List result = new ArrayList();
        if (s.length() <= 10) {
            return new ArrayList<>();
        }
        HashMap hashMap = new HashMap();
        int length = s.length();
        for (int i = 0; i <= length - 10; i++) {
            String temp = s.substring(i, i + 10);
            if (hashMap.containsKey(temp)) {
                if (!result.contains(temp)) {
                    result.add(temp);
                }
            } else {
                hashMap.put(temp, 1);
            }
        }
        return result;
    }
}
