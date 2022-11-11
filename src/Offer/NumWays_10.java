package Offer;

public class NumWays_10 {
    public int numWays(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1000000007;
            a = b;
            b = result;
        }
        return result;
    }
}
