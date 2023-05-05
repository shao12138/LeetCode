package JinDian;

public class Search_57 {
    public static void main(String[] args) {
        int[] nums = new int[]{15, 15, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int target = 5;
        System.out.println(search(nums, target));
        System.out.println();
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
                return  left;
            } else if (nums[right] == target) {
                while (right>=0){
                    if (nums[right-1]==target){
                        right--;
                    }else {
                        break;
                    }
                }
                return right;
            }
            if (nums[left] <= nums[left + 1]) {
                left++;
            }
            if (nums[right] >= nums[right - 1]) {
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
