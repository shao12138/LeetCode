package SuanFa_1800;

public class FindRotation_1886 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = new int[][]{{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        findRotation(matrix, target);
    }

    public static boolean findRotation(int[][] matrix, int[][] target) {
        for (int i = 0; i < 4; i++) {
            boolean flag = rotate(matrix, target);
            if (flag == true) {
                return true;
            }
        }
        return true;
    }

    public static boolean rotate(int[][] matrix, int[][] target) {
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
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
