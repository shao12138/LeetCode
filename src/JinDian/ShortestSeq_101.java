package JinDian;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShortestSeq_101 {
    Map<Integer, Integer> ori = new HashMap<Integer, Integer>();
    Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

    public boolean check() {
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer key = (Integer) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }

    public int[] shortestSeq(int[] big, int[] small) {
        int tLen = small.length;
        for (int i = 0; i < tLen; i++) {
            int c = small[i];
            ori.put(c, ori.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = big.length;
        while (r < sLen) {
            ++r;
            if (r < sLen && ori.containsKey(big[r])) {
                cnt.put(big[r], cnt.getOrDefault(big[r], 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(big[l])) {
                    cnt.put(big[l], cnt.getOrDefault(big[l], 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? new int[]{} : new int[]{ansL, ansR-1};
    }
}
