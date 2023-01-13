package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray_75 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> result = new HashMap();
        for (int i : arr2) {
            result.put(i, 0);
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i : arr1) {
            if (result.containsKey(i)) {
                result.put(i, result.get(i) + 1);
            } else {
                arrayList.add(i);
            }
        }
        int[] finish = new int[arr1.length];
        int index = 0;
        for (int i : arr2) {
            int times = result.get(i);
            for (int j = 0; j < times; j++) {
                finish[index++] = i;
            }
        }
        int[] middle = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            middle[i] = arrayList.get(i);
        }
        Arrays.sort(middle);
        for (int i = 0; i < middle.length; i++) {
            finish[i + index] = middle[i];
        }
        return finish;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        relativeSortArray(arr1, arr2);
    }
}
