package SuanFa_1400;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFlood_1488 {
    public static int[] avoidFlood(int[] rains) {
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                set.add(i);
                ans[i] = 1;
            } else {
                ans[i] = -1;
                if (map.containsKey(rains[i])) {
                    Integer a = set.higher(map.get(rains[i]));
                    if (a == null) {
                        return new int[0];
                    } else {
                        set.remove(a);
                        ans[a] = rains[i];
                    }
                }
                map.put(rains[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] rains = new int[]{1, 2, 0, 0, 2, 1};
        avoidFlood(rains);
    }
}
