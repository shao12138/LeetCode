package SuanFa_1;

public class SearchRange_34 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3};
        int b = 1;
        searchRange(a, b);
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[2];
        while (left <= right) {
            int a = nums[left];
            int b = nums[right];
            if (a == target) {
                result[0] = left;
            } else {
                left++;
            }
            if (b == target) {
                result[1] = right;
            } else {
                right--;
            }
            if (a == b && a == target) {
                return result;
            }
        }
        return new int[]{-1, -1};
    }
}
