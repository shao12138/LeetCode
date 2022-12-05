package Offer;

public class CuttingRope_14_2 {
    public int cuttingRope(int n) {
        long result = 1;
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        }
        for (; n > 4; n -= 3) {
            result *= 3;
            result = result%1000000007;
        }
        result *= n;
        return (int)(result% 1000000007);
    }
}
