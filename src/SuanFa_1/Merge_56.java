package SuanFa_1;

import java.util.*;

public class Merge_56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) {
            return null;
        }
        //先按起点升序，再按终点降序
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        List<int[]> res = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] > right) {
                res.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            } else if (intervals[i][1] < right) {
                //被覆盖
            } else if (intervals[i][1] >= right && intervals[i][0] <= right) {
                //相交
                right = intervals[i][1];
            }
        }
        res.add(new int[]{left, right});

        return res.toArray(new int[0][]);
    }
}
