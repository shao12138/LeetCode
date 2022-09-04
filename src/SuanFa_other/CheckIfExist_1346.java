package SuanFa_other;

import java.util.Arrays;

public class CheckIfExist_1346 {
    public static void main(String[] args) {
        int[] a = new int[]{-20, 8, -6, -14, 0, -19, 14, 4};
        checkIfExist(a);
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]*2==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
