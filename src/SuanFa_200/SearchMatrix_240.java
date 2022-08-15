package SuanFa_200;

public class SearchMatrix_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            if (target >= matrix[row][0]) {
                for (int j = 0; j < matrix.length; j++) {
                    if (target == matrix[row][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
