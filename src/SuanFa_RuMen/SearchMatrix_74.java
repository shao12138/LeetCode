package SuanFa_RuMen;

public class SearchMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (target < matrix[i][0]) {
                if (i == 0) {
                    index = 0;
                } else {
                    index = i - 1;
                }
                break;
            }
        }
        if (matrix[index+1][0]==target){
            return true;
        }
        for (int i = 0; i < matrix[0].length; i++) {
           if (matrix[index][i]==target){
               return true;
           }
        }
        return false;
    }
}
