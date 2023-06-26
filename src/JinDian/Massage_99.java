package JinDian;

public class Massage_99 {
    public int massage(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result[] = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
        }
        return result[result.length - 1];
    }
}
