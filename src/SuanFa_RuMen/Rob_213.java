package SuanFa_RuMen;

public class Rob_213 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2};
        rob(a);
    }

    public static int rob(int[] nums) {
        int result[] = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i <= nums.length - 2; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
        }

        int result2[] = new int[nums.length];
        result2[1] = nums[1];
        result2[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i <= nums.length-1; i++) {
            result2[i] = Math.max(result2[i - 1], result2[i - 2] + nums[i]);
        }
        return Math.max(result[result.length - 2], result2[result2.length - 1]);
    }
}
