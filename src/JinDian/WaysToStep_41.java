package JinDian;

public class WaysToStep_41 {
    public int waysToStep(int n) {
        long f1 = 0, f2 = 0, f3 = 0, fx = 1;
        for (int i = 1; i <= n; ++i) {
            f1 = f2 % 1000000007;
            f2 = f3 % 1000000007;
            f3 = fx % 1000000007;
            fx = f1 + f2 + f3;
        }
        return (int) (fx % 1000000007);
    }
}
