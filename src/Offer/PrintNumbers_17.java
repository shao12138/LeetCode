package Offer;

public class PrintNumbers_17 {
    public int[] printNumbers(int n) {
        if (n == 0) {
            return null;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += 9 * Math.pow(10, i);
        }
        int[] a = new int[max];
        for (int i = 1; i <= max; i++) {
            a[i - 1] = i;
        }
        return a;
    }
}
