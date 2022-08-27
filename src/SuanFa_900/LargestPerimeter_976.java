package SuanFa_900;

import java.util.Arrays;

public class LargestPerimeter_976 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2};
        largestPerimeter(nums);
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int left = nums.length - 3;
        int middle = nums.length - 2;
        int right = nums.length - 1;
        int result = Integer.MIN_VALUE;
        while (left >= 0) {
            if (nums[left] + nums[middle] > nums[right]) {
                result = Math.max(result, nums[left] + nums[middle] + nums[right]);
                return result;
            } else {
                left--;
                middle--;
                right--;
            }
        }
        return 0;
    }
}
