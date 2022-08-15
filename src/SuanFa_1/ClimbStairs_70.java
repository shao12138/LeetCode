package SuanFa_1;

public class ClimbStairs_70 {
    public int climbStairs(int n) {
        int f1 = 0, f2 = 0, fx = 1;
        for (int i = 1; i <= n; ++i) {
            f1 = f2;
            f2 = fx;
            fx = f1 + f2;
        }
        return fx;
    }

}
