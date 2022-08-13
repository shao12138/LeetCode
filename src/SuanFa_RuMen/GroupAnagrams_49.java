package SuanFa_RuMen;

import java.util.*;

public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < strs.length; i++) {
            stack.push(strs[i]);
        }
        HashMap<String, ArrayList> hashMap = new HashMap<>();
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            Set<String> keys = hashMap.keySet();
            Iterator<String> iterator = keys.iterator();
            boolean flag = false;
            String f = "";
            while (iterator.hasNext()) {
                f = iterator.next();
                if (isAnagram(temp, f)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                hashMap.get(f).add(temp);
            } else {
                ArrayList t = new ArrayList();
                t.add(temp);
                hashMap.put(temp, t);
            }
        }
        ArrayList result = new ArrayList();
        Collection<ArrayList> value = hashMap.values();
        Iterator<ArrayList> iterator2 = value.iterator();
        while (iterator2.hasNext()) {
            result.add(iterator2.next());
        }
        return result;
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
