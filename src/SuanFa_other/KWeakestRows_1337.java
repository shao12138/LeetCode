package SuanFa_other;

import java.util.Arrays;
import java.util.HashMap;

public class KWeakestRows_1337 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,0,0,0}, {1,1,1,1}, {1,0,0,0}, {1,0,0,0}};
        kWeakestRows(mat, 2);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int index = 0;
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] == 0) {
                    for (int c = 0; c < mat[0].length; c++) {
                        mat[i][c] = -1;
                    }
                    result[index] = i;
                    index++;
                }
                if (index == k) {
                    return result;
                }
            }
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][j] == 1 && j == mat[0].length - 1) {
                    if (index < mat.length && index < k) {
                        result[index] = i;
                        index++;
                    }
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return new int[k];
    }
}
