package SuanFa_RuMen;

import java.util.*;

public class LongestPalindrome_409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        longestPalindrome(s);
    }

    public static int longestPalindrome(String s) {
        int result = 0;
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (hashMap.containsKey(temp)) {
                hashMap.put(temp, hashMap.get(temp) + 1);
            } else {
                hashMap.put(temp, 1);
            }
        }
        Set<Character> keys = hashMap.keySet();
        Iterator<Character> iterator = keys.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            char temp = iterator.next();
            int sum = hashMap.get(temp);
            if (sum % 2 == 0) {
                result += sum;
            } else if (sum % 2 != 0 && sum != 1) {
                result += sum - 1;
                count++;
            } else if (sum == 1) {
                count++;
            }
        }
        if (count >= 1) {
            result++;
        }
        return result;
    }
}
