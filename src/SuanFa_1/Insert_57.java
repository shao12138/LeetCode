package SuanFa_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_57 {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{};
        int[] newInterval = new int[]{5, 7};
        insert(intervals, newInterval);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] temp = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            temp[i] = intervals[i];
        }
        temp[n] = newInterval;
        Arrays.sort(temp, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        //先按起点升序，再按终点降序
        List<int[]> res = new ArrayList<>();
        int left = temp[0][0];
        int right = temp[0][1];
        for (int i = 0; i <= n; i++) {
            if (temp[i][0] > right) {
                //无交集
                res.add(new int[]{left, right});
                left = temp[i][0];
                right = temp[i][1];
            } else if (temp[i][1] < right) {
                //被覆盖
            } else if (temp[i][1] >= right && temp[i][0] <= right) {
                //相交
                right = temp[i][1];
            }
        }
        res.add(new int[]{left, right});
        return res.toArray(new int[0][]);
    }
}
