package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayRankTransform_1331 {
    public static void main(String[] args) {
        int[] a = new int[]{10, 10, 10, 10};
        arrayRankTransform(a);
    }

    public static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
        int[] c = arr.clone();
        int[] result = new int[c.length];
        int x = 0;
        Arrays.sort(c);
        HashMap<Integer, Integer> b = new HashMap();
        int index = 1;
        for (int j = 0; j < c.length; j++) {
            if (!b.containsKey(c[j])) {
                b.put(c[j], index);
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = b.get(arr[i]);
        }
        return result;
    }
}
