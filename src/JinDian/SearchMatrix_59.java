package JinDian;

public class SearchMatrix_59 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row==0){
            return false;
        }
        int column = matrix[0].length;
        if (column==0){
            return false;
        }
        for (int i = 0; i < row; i++) {
            int temp = matrix[i][0];
            if (target == temp) {
                return true;
            } else if (target > temp) {
                for (int j = 1; j < column; j++) {
                    if (target == matrix[i][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
