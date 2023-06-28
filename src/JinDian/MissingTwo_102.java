package JinDian;

public class MissingTwo_102 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4};
        missingTwo(nums);
    }

    public static int[] missingTwo(int[] nums) {
        int n = nums.length + 2;
        long sum = 0;
        for (int i : nums) sum += i;

        // 等差数列求和na1 + n(n - 1) / 2
        long sumTwo = n * (n + 1) / 2 - sum;
        // 一个数比avg小一个比avg大
        long avg = sumTwo / 2;

        sum = 0;
        for (int i : nums) {
            if (i <= avg) sum += i;
        }
        long one = avg * (avg + 1) / 2 - sum;
        return new int[]{(int) one, (int) (sumTwo - one)};
    }
}
