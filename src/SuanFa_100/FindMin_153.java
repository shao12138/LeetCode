package SuanFa_100;

public class FindMin_153 {
    public int findMin(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]<nums[left+1]){
                left++;
            }
            if (nums[right]>nums[right-1]){
                right--;
            }
        }
        return nums[right];
    }
}
