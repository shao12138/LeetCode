package SuanFa_1300;

import java.util.Arrays;

public class FindBestValue_1300 {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 9, 3};
        int target = 10;
    }

    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int left = target / arr.length;
        int right = arr[arr.length - 1];
        while (left < right) {
            int middle = left + (right - left) / 2;
            int sum = calSum(arr, middle);
            if (sum < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        // 和第一个严格小于target的value 的进行绝对值比较。 返回较小的那个。
        if (Math.abs(calSum(arr, left - 1) - target) <= Math.abs(calSum(arr, left) - target)) {
            return left - 1;
        }
        return left;
    }

    private int calSum(int[] arr, int value) {
        int total = 0;

        for (int num : arr) {
            if (num > value) {
                total += value;
            } else {
                total += num;
            }
        }
        return total;
    }
}
