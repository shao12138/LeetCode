package SuanFa_RuMen;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        threeSumClosest(nums, target);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int f = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if (result > Math.abs(target - temp)) {
                    result = Math.abs(target - temp);
                    f = temp;
                }
                if (temp > target) {
                    right--;
                } else if (temp < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return f;
    }
}
