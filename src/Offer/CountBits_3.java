package Offer;

public class CountBits_3 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(n);
        }
        return result;
    }
}
