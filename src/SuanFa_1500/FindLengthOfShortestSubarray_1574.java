package SuanFa_1500;

public class FindLengthOfShortestSubarray_1574 {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int leftEnd = 0;
        for (int i = 1; i < n && arr[i] >= arr[i - 1]; i++) {
            leftEnd = i;
        }
        if (leftEnd == n - 1) {
            return 0;
        }
        int rightStart = n - 1;
        for (int i = n - 2; i >= 0 && arr[i] <= arr[i + 1]; i--) {
            rightStart = i;
        }
        int low = rightStart - leftEnd - 1;
        int high = Math.min(rightStart, n - leftEnd - 1);
        while (low < high) {
            int tmp = low + (high - low) / 2;
            if (canMakeSorted(arr, leftEnd + 1, rightStart - 1, tmp)) {
                high = tmp;
            } else {
                low = tmp + 1;
            }
        }
        return low;
    }

    public boolean canMakeSorted(int[] arr, int midStart, int midEnd, int remove) {
        int n = arr.length;
        for (int i = midEnd - remove, j = midEnd + 1; i < midStart; i++, j++) {
            if (arr[i] <= arr[j]) {
                return true;
            }
        }
        return false;
    }
}
