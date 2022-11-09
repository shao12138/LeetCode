package Offer;

public class FindNumberIn2DArray_4 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{-1, 3}};
        int target = 3;
        findNumberIn2DArray(matrix, target);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
                int left = 0;
                int right = matrix[0].length - 1;
                while (left <= right) {
                    int middle = left + (right - left) / 2;
                    if (matrix[i][middle] > target) {
                        right = middle - 1;
                    } else if (matrix[i][middle] == target) {
                        return true;
                    } else {
                        left = middle + 1;
                    }
                }
            }
        }
        return false;
    }
}
