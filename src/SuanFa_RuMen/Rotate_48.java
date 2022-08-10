package SuanFa_RuMen;

public class Rotate_48 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < n - i; j++) {
                // 获取各顶点的值
                int a = matrix[i][j]; // 左上角
                int b = matrix[j][n - i]; // 右上角
                int c = matrix[n - i][n - j]; // 右下角
                int d = matrix[n - j][i]; // 左下角
                // 交换各顶点的值
                matrix[i][j] = d; // 左上角
                matrix[j][n - i] = a; // 右上角
                matrix[n - i][n - j] = b; // 右下角
                matrix[n - j][i] = c; // 左下角
            }
        }
    }
}
