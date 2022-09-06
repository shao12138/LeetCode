package SuanFa_300;

public class NumArray_303 {
    int[] result;

    public NumArray_303(int[] nums) {
        result = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += result[i];
        }
        return sum;
    }
}
