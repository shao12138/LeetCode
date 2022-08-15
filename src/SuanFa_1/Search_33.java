package SuanFa_1;

public class Search_33 {
    public static void main(String[] args) {
        int a[] = new int[]{5,1,3};
        int target = 1;
        System.out.println(search(a, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        while (left <= right) {
            if (nums[left] == target) {
                return left;
            } else if (nums[right] == target) {
                return right;
            }
            if (nums[left] < nums[left + 1]) {
                left++;
            }
            if (nums[right] > nums[right - 1]) {
                right--;
            }
            if (left + 1 == right) {
                if (nums[left] == target) {
                    return left;
                }
                if (nums[right] == target) {
                    return right;
                }
                return -1;
            }
        }
        return -1;
    }
}
