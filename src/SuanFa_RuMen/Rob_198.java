package SuanFa_RuMen;

public class Rob_198 {
    public int rob(int[] nums) {
        int result[] = new int[nums.length];

        if (nums.length == 1) {
            return nums[0];
        }
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
        }
        return result[result.length - 1];
    }
}
