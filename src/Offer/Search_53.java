package Offer;

public class Search_53 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2};
        search(nums, 1);
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] >= target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        if (left >= nums.length || nums[left] != target) {
            return 0;
        }
        int count = 1;
        for (int i = left; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] && nums[i] == target) {
                count++;
            }
        }
        return count;
    }
}
