package SuanFa_1;

public class RemoveDuplicates_80 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int result = nums.length;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp && nums[i] != 1000000) {
                count++;
                if (count >= 3) {
                    for (int j = i - 1; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = 1000000;
                    i--;
                    result--;
                    count--;
                }
            } else {
                temp = nums[i];
                count = 1;
            }
        }
        return result;
    }
}
