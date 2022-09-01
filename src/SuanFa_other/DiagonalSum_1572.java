package SuanFa_other;

public class DiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        diagonalSum(nums);
    }

    public static int diagonalSum(int[][] mat) {
        int result = 0;
        boolean flag = mat.length % 2 != 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (flag && i == mat.length / 2) {
                    if (j == i) {
                        result += mat[i][j];
                    }
                } else {
                    if (j == i) {
                        result += mat[i][j];
                    }
                    if (j == mat.length - i - 1) {
                        result += mat[i][j];
                    }
                }
            }
        }
        return result;
    }
}
