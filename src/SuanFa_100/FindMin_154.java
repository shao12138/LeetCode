package SuanFa_100;

public class FindMin_154 {
    public int findMin(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[right]>=nums[right-1]){
                right--;
            }else{
                return nums[right];
            }
        }
        return nums[0];
    }
}
