package SuanFa_200;

import java.util.Arrays;

public class HIndex_274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if (citations.length == 1) {
            return citations[0] >= 1 ? 1 : 0;
        }
        int left = 0;
        int right = citations.length;
        int middle = 0;
        int ans = 0;
        while (left < right) {
            middle = left + (right - left) / 2;
            int temp = citations.length - middle;
            if (temp > citations[middle]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return citations.length - left;
    }
}
