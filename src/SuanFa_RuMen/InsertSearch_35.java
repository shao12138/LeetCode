package SuanFa_RuMen;

public class InsertSearch_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target < nums[left]) {
            return 0;
        } else if (target > nums[right]) {
            return right + 1;
        }
        while (true) {
            int index = (left + right) / 2;
            if (target == nums[index]) {
                return index;
            } else if (target > nums[index]) {
                left = index + 1;
            } else if (target < nums[index]) {
                right = index - 1;
            }
            if (left == right) {
                return index + 1;
            }else if (left>right){
                return index;
            }
        }
    }
}
