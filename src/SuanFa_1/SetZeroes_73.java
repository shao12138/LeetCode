package SuanFa_1;

import java.util.ArrayList;

public class SetZeroes_73 {
    public void setZeroes(int[][] matrix) {
        ArrayList a = new ArrayList();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    a.add(new int[]{i, j});
                }
            }
        }
        for (int i = 0; i < a.size(); i++) {
            int[] temp = (int[]) a.get(i);
            for (int n = 0; n < col; n++) {
                matrix[temp[0]][n] = 0;
            }
            for (int m = 0; m < row; m++) {
                matrix[m][temp[1]] = 0;
            }
        }
    }
}
