package JinDian;

import java.util.Arrays;

public class Merge_55 {
    public static void merge(int[] A, int m, int[] B, int n) {
        for (int i = m; i < m + n && n != 0; i++) {
            A[i] = B[i - m];
        }
        Arrays.sort(A);
    }

    public static void main(String[] args) {

    }
}
