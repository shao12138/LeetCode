package JinDian;

import java.util.ArrayList;

public class SetZeroes_8 {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> arrayList = new ArrayList();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arrayList.add(new int[]{i, j});
                }
            }
        }
        for (int k = 0; k < arrayList.size(); k++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][arrayList.get(k)[1]] = 0;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[arrayList.get(k)[0]][j] = 0;
            }
        }
    }
}
