package SuanFa_other;

public class MaximumWealth_1672 {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                temp+=accounts[i][j];
            }
            result= Math.max(result,temp);
        }
        return result;
    }
}
