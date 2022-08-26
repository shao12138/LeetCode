package SuanFa_400;

import java.util.*;

public class FrequencySort_451 {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> occurrences = new HashMap<Character, Integer>();
        for (char num : s.toCharArray()) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return n[1] - m[1];
            }
        });
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            char num = entry.getKey();
            int count = entry.getValue();
            queue.offer(new int[]{num, count});
        }
        String result = "";
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            for (int i = 0; i < temp[1]; i++) {
                result += (char)temp[0];
            }
        }
        return result;
    }
}
