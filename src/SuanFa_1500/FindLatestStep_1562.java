package SuanFa_1500;

import java.util.HashMap;
import java.util.Map;

public class FindLatestStep_1562 {
    public int findLatestStep(int[] arr, int m) {
        Map<Integer, Integer> startEnd = new HashMap<>();
        Map<Integer, Integer> endStart = new HashMap<>();
        int ans = -1;
        int mCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            int start = v;
            int end = v;
            //往前找
            if (endStart.containsKey(v - 1)) {
                start = endStart.get(v - 1);
                if (v - start == m) --mCnt;
                endStart.remove(v - 1);
            }

            //往后找
            if (startEnd.containsKey(v + 1)) {
                end = startEnd.get(v + 1);
                if (end - v == m) --mCnt;
                startEnd.remove(v + 1);
            }

            startEnd.put(start, end);
            endStart.put(end, start);
            if (end - start + 1 == m) ++mCnt;
            if (mCnt > 0) ans = i + 1;
        }
        return ans;
    }
}
