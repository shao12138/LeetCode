package SuanFa_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMumAbsDifference_1200 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        minimumAbsDifference(arr);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            ArrayList<Integer> middle = new ArrayList<>();
            if (min > temp) {
                result.clear();
                min = temp;
                middle.add(arr[i]);
                middle.add(arr[i + 1]);
                result.add(middle);
            } else if (min == temp) {
                middle.add(arr[i]);
                middle.add(arr[i + 1]);
                result.add(middle);
            }
        }
        return result;
    }
}
