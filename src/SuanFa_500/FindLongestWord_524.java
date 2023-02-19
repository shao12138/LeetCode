package SuanFa_500;

import java.util.*;

public class FindLongestWord_524 {
    public String findLongestWord(String f, List<String> dictionary) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                int result = s2.length() - s1.length();
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        });
        for (int i = 0; i < dictionary.size(); i++) {
            if (isSubsequence(f, dictionary.get(i))) {
                queue.add(dictionary.get(i));
            }
        }
        if (queue.isEmpty()){
            return "";
        }
        return queue.poll();
    }

    public boolean isSubsequence(String t, String s) {
        int j = -1;
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            int temp = t.indexOf(c, j+1);
            if (temp == -1) {
                return false;
            }
            if (temp == j) {
                j++;
            }else {
                j = temp;
            }
        }
        return true;
    }
}