package SuanFa_1400;

import java.util.Arrays;

public class MinDays_1482 {
    public static void main(String[] args) {
        int[] bloomDay = new int[]{7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        minDays(bloomDay, m, k);
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int[] day = bloomDay.clone();
        Arrays.sort(day);
        int left = day[0];
        int right = day[day.length - 1];
        while (left < right) {
            int middle = left + (right - left) / 2;
            int result = 0;
            int[] temp = bloomDay.clone();
            for (int i = 0; i < temp.length; i++) {
                temp[i] -= middle;
                if (temp[i] < 0) {
                    temp[i] = 0;
                }
            }
            for (int i = 0; i < bloomDay.length - k + 1; i++) {
                int count = 0;
                for (int j = 0; j < k; j++) {
                    if (temp[i] == temp[i + j] && temp[i] == 0) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == k) {
                    for (int j = 0; j < k; j++) {
                        temp[i + j] = -1;
                    }
                    result++;
                }
            }
            if (result < m) {
                left = middle + 1;
            }
            if (result >= m) {
                right = middle;
            }
        }
        return right;
    }
}
