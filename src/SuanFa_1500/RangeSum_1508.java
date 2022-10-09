package SuanFa_1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSum_1508 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        rangeSum(a, 4, 1, 5);
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int length = (1 + n) * n / 2;
        final int MOD = 1000000000 + 7;
        int[] result = new int[length];
        result = continuousSubList(nums, length);
        Arrays.sort(result);
        long sum = 0;
        for (int i = left - 1; i < right - 1; i++) {
            sum += result[i];
        }
        return (int) (sum % MOD);
    }

    public static int[] continuousSubList(int[] arr, int length) {
        int[] result = new int[length];
        List<Integer> resultList = new ArrayList<>();
        if (arr == null || arr.length < 1) {
            return null;
        }
        // 对于每个位置都求包含他本身在内的所有连续子数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // 从 i ~ j位置求得一个子数组
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                }
                resultList.add(temp);
            }
        }
        for (int i = 0; i < length; i++) {
            result[i] = resultList.get(i);
        }
        // 返回最终结果
        return result;
    }
}
