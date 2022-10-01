package SuanFa_other;

public class SmallestDivisor_1283 {
    public static void main(String[] args) {
        int[] nums = new int[]{44,22,33,11,1};
        int threshold = 5;
        smallestDivisor(nums, threshold);
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < nums.length; x++) {
            max = Math.max(max, nums[x]);
        }
        int left = 1;
        int right = max;
        int result = Integer.MIN_VALUE;
        while (left < right) {
            int middle = (left + right) / 2;
            double sum = 0.0;
            for (int j = 0; j < nums.length; j++) {
                sum += (int) Math.ceil((double) nums[j] / middle);
            }
            if (sum <= threshold) {
                right = middle ;
            } else {
                left = middle + 1;
            }
        }
        return result;
    }
}
