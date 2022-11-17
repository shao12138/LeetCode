package Offer;

public class Exchange_21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] % 2 == 0 && nums[right] % 2 != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            } else if (nums[left] % 2 != 0) {
                left++;
            } else {
                right--;
            }
        }
        return nums;
    }
}
