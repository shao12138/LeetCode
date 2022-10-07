package SuanFa_800;

public class MaxProfitAssignment_826 {
    public static void main(String[] args) {
        int[] difficulty = new int[]{13, 37, 58};
        int[] profit = new int[]{4, 90, 96};
        int[] worker = new int[]{34, 73, 45};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        for (int i = 0; i < difficulty.length; i++) {
            for (int j = 0; j < difficulty.length - 1; j++) {
                if (difficulty[j] > difficulty[j + 1]) {
                    int temp = difficulty[j];
                    difficulty[j] = difficulty[j + 1];
                    difficulty[j + 1] = temp;

                    temp = profit[j];
                    profit[j] = profit[j + 1];
                    profit[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < worker.length; i++) {
            int left = 0;
            int right = difficulty.length - 1;
            int max = 0;
            int ans = -1;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if (difficulty[middle] <= worker[i]) {
                    left = middle + 1;
                    ans = middle;

                } else {
                    right = middle-1;
                }
            }
            if (ans != -1) {
                for (int j = 0; j <= ans; j++) {
                    max = Math.max(max, profit[j]);
                }
            }
            sum += max;
        }
        return sum;
    }
}
