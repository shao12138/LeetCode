package SuanFa_RuMen;

import java.util.ArrayList;

public class IntervalIntersection_986 {
    public static void main(String[] args) {
//        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
//        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] firstList = {{3, 10}};
        int[][] secondList = {{5, 10}};
        intervalIntersection(firstList, secondList);
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> arrayList = new ArrayList();
        int left = 0;
        int right = 0;
        while (left < firstList.length && right < secondList.length) {
            int a = firstList[left][0];
            int b = firstList[left][1];
            int c = secondList[right][0];
            int d = secondList[right][1];
            if (a < c && b > d) {
                arrayList.add(new int[]{c, d});
                right++;
            } else if (c < a && d > b) {
                arrayList.add(new int[]{a, b});
                left++;
            } else if (a <= c && b <= d && b > c) {
                arrayList.add(new int[]{c, b});
                left++;
            } else if (c <= a && d <= b && a < d) {
                arrayList.add(new int[]{a, d});
                right++;

            } else if (a <= c && b <= d && b < c) {
                left++;
            } else if (c <= a && d <= b && a > d) {
                right++;
            } else if (b == c) {
                arrayList.add(new int[]{b, c});
                left++;
            } else if (a == d) {
                arrayList.add(new int[]{a, d});
                right++;
            }
        }
        return arrayList.toArray(new int[arrayList.size()][]);
    }
}
