package SuanFa_RuMen;

public class MoveZero_283 {
    public static void main(String[] args) {
        int nums[] = {2, 1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
            }
        }
        if (count != nums.length) {
            while (true) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 0) {
                        left = i;
                        break;
                    }
                }
                for (int i = start; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        right = i;
                        break;
                    }
                }
                if (left < right) {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
                start++;
                int finish_left = 0;
                int finish_right = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 0) {
                        finish_left = i;
                        break;
                    }
                }
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        finish_right = i;
                    }
                }
                if (finish_right <= finish_left) {
                    break;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
