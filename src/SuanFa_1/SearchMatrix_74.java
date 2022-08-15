package SuanFa_1;

public class SearchMatrix_74 {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        System.out.println( searchMatrix(a,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[0][i]==target){
                    return true;
                }
            }
            return false;
        }
        if (matrix[0].length==1){
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0]==target){
                    return true;
                }
            }
            return false;
        }
        for (int i=0;i<matrix.length;i++){
            if (matrix[i][0] == target) {
                return true;
            }
        }
        for (int i=0;i<matrix[0].length;i++){
            if (matrix[matrix.length-1][i]==target){
                return true;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (target < matrix[i][0]) {
                if (i == 0) {
                    index = 0;
                } else {
                    index = i-1;
                }
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[index][i] == target) {
                return true;
            }
        }
        return false;
    }
}