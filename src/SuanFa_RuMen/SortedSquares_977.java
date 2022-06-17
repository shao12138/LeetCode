package SuanFa_RuMen;

public class SortedSquares_977 {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));
    }
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int newNums[] = new int[nums.length];
        int index = right;
        while (left < right) {
            boolean flag = nums[left] * nums[left] >= nums[right] * nums[right];
            if (flag) {
                newNums[index] = nums[left] * nums[left];
                left += 1;
            } else {
                newNums[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        newNums[index] = nums[left] * nums[left];
        return newNums;
    }
}
