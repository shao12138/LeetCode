package SuanFa_RuMen;

import java.util.*;

public class EraseOverlapIntervals_435 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        eraseOverlapIntervals(a);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        //按照右区间降序排列
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        int cur = intervals[0][1];
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (cur > intervals[i][0]) {
                res++;
            } else {
                cur = intervals[i][1];
            }
        }
        return res;
    }
}
