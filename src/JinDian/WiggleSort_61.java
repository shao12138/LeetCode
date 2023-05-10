package JinDian;

import java.util.Arrays;

public class WiggleSort_61 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 2, 1, 6, 4};
        wiggleSort(nums);
    }

    public static void wiggleSort(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}
