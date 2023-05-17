package JinDian;

import java.util.Arrays;

public class SmallestDifference_67 {
    public static void main(String[] args) {
        int[] a = new int[]{-2147483648, 1};
        int[] b = new int[]{2147483647, 0};
        smallestDifference(a, b);
    }

    public static int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        long minDiff = Integer.MAX_VALUE;
        while (i < a.length && j < b.length) {
            long temp = a[i] - b[j];
            long diff = Math.abs(temp);
            if (diff < minDiff) {
                minDiff = diff;
            }
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return (int) minDiff;
    }
}
