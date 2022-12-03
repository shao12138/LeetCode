package Offer;

public class DicesProbability_60 {
    public double[] dicesProbability(int n) {
        if (n == 1) {
            return new double[]{0.16667, 0.16667, 0.16667, 0.16667, 0.16667, 0.16667};
        }
        //dpTable[i][j]表示有i给骰子的时候投j点的次数
        int[][] dpTable = new int[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            dpTable[1][i] = 1;
        }
        double total = 0;
        //从两个骰子开始
        for (int i = 2; i < dpTable.length; i++) {
            //i给骰子可以投的点数
            for (int j = i; j <= 6 * i; j++) {
                //第i次投的骰子数
                for (int k = 1; k <= 6 && k < j; k++) {
                    dpTable[i][j] += dpTable[i - 1][j - k];
                }
                if (i == n) {
                    total += dpTable[i][j];
                }
            }
        }
        double[] res = new double[5 * n + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = dpTable[n][n + i] / total;
        }
        return res;
    }
}
