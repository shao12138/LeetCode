package Offer;

public class CuttingRope_14 {
    public int cuttingRope(int n) {
        int result = 1;
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        while (n >= 3) {
            if (n == 4) {
                result *= 4;
                n -= 4;
            } else {
                result *= 3;
                n -= 3;
            }
        }
        if (n != 0) {
            result = n * result;
        }
        return result;
    }
}
