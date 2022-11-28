package Offer;

public class LastRemaining_62 {
    public int lastRemaining(int n, int m) {
        int res = 0;// 最后只剩下一位，坐标肯定是0
        for (int i = 2; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
