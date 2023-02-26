package SuanFa_600;

import java.util.*;

public class TopKFrequent_692 {
    public static void main(String[] args) {
        String[] words = new String[]{"i","love","leetcode","i","love","coding"};
        topKFrequent(words, 2);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        for (String num : words) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<String[]> queue = new PriorityQueue<String[]>(new Comparator<String[]>() {
            public int compare(String[] m, String[] n) {
                int count1 = Integer.parseInt(m[1]);
                int count2 = Integer.parseInt(n[1]);
                if (count1 != count2) {
                    return count1 - count2; // 按照出现次数从大到小排序
                } else {
                    return n[0].compareTo(m[0]); // 次数相同时按照字典从小到大排序
                }
            }
        });
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            String num = entry.getKey();
            int count = entry.getValue();
            if (queue.size() == k) {
                int temp = Integer.parseInt(queue.peek()[1]);
                String temp2 = queue.peek()[0];
                if (temp < count) {
                    queue.poll();
                    queue.offer(new String[]{num, count + ""});
                } else if (temp == count) {
                    if (num.compareTo(temp2) < 0) {
                        queue.poll();
                        queue.offer(new String[]{num, count + ""});
                    }
                }
            } else {
                queue.offer(new String[]{num, count + ""});
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < k; ++i) {
            arrayList.add(queue.poll()[0]);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
