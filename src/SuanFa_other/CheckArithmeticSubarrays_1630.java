package SuanFa_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckArithmeticSubarrays_1630 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList result = new ArrayList();
        int m = l.length;
        for (int i = 0; i < m; i++) {
            int left = l[i];
            int right = r[i];
            int[] temp = new int[right - left + 1];
            for (int j = left; j <= right; j++) {
                temp[j - left] = nums[j];
            }
            Arrays.sort(temp);
            result.add(canMakeArithmeticProgression(temp));
        }
        return result;
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int temp = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != temp) {
                return false;
            }
        }
        return true;
    }
}
