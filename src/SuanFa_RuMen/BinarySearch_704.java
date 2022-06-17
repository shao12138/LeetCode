package SuanFa_RuMen;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 13));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (true) {
            int index = (left + right) / 2;
            if (target == nums[index]) {
                return index;
            } else if (target > nums[index]) {
                left = index+1;
            } else if (target < nums[index]) {
                right = index-1;
            }
            if (left>right){
                return -1;
            }
        }
    }
}
