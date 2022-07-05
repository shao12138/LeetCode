package SuanFa_RuMen;

public class UniquePaths_62 {
    public int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int K = n - 1;
        double num = 1.0;
        for (int i = 1; i <= K; ++i) {
            num = num * (N - K + i) / i;
        }
        return (int) num;

    }
}
