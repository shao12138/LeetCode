package SuanFa_500;

public class NextGreaterElements_503 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};
        nextGreaterElements(nums);
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            result[i] = find(i, temp, nums);
        }
        return result;
    }

    public static int find(int i, int temp, int[] nums) {
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > temp) {
                return nums[j];
            }
        }
        for (int j = 0; j < i; j++) {
            if (nums[j] > temp) {
                return nums[j];
            }
        }
        return -1;
    }
}
