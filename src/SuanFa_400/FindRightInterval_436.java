package SuanFa_400;

import java.util.Arrays;
import java.util.HashMap;

public class FindRightInterval_436 {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{ {3, 4},{2, 3},{1, 2}};
        findRightInterval(intervals);
    }

    public static int[] findRightInterval(int[][] intervals) {
        HashMap<int[], Integer> hashMap = new HashMap();
        for (int i = 0; i < intervals.length; i++) {
            hashMap.put(intervals[i], i);
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int[] result = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int count = 0;
            for (int j = i; j < intervals.length; j++) {
                if (intervals[i][1] <= intervals[j][0]) {
                    result[hashMap.get(intervals[i])] = hashMap.get(intervals[j]);
                    break;
                } else {
                    count++;
                }
            }
            if (count == intervals.length - i) {
                result[hashMap.get(intervals[i])] = -1;
            }
        }
        result[hashMap.get(intervals[intervals.length - 1])] = -1;
        return result;
    }
}
