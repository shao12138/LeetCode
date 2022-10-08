package SuanFa_1;

public class Search_81 {
    public static void main(String[] args) {
        int a[] = new int[]{5, 1, 3};
        int target = 1;
        System.out.println(search(a, target));
    }

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right) {
            if (nums[0] == target) {
                return true;
            } else {
                return false;
            }
        }
        while (left <= right) {
            if (nums[left] == target) {
                return true;
            } else if (nums[right] == target) {
                return true;
            }
            if (nums[left] <= nums[left + 1]) {
                left++;
            }
            if (nums[right] >= nums[right - 1]) {
                right--;
            }
            if (left + 1 == right) {
                if (nums[left] == target) {
                    return true;
                }
                if (nums[right] == target) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
