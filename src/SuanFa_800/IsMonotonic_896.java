package SuanFa_800;

public class IsMonotonic_896 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3,2};
        isMonotonic(nums);
    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        boolean flag = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                flag = nums[i] > nums[i + 1];
                break;
            }
        }
        if (flag) {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        if (!flag) {
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
