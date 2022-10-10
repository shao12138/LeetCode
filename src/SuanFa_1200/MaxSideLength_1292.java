package SuanFa_1200;

public class MaxSideLength_1292 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}};
        int threshold = 4;
        maxSideLength(mat, threshold);
    }

    public static int maxSideLength(int[][] mat, int threshold) {
        int row = mat.length;
        int col = mat[0].length;
        int left = 1;
        int right = Math.min(row, col);
        int middle = 0;
        int ans = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            int sum = 0;
            boolean flag = false;
            for (int i = 0; i <= row - middle; i++) {
                for (int j = 0; j <= col - middle; j++) {
                    sum = 0;
                    for (int m = i; m < i + middle; m++) {
                        for (int n = j; n < j + middle; n++) {
                            sum += mat[m][n];
                        }
                    }
                    if (sum <= threshold) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                left = middle + 1;
                ans = Math.max(middle, ans);
            } else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
