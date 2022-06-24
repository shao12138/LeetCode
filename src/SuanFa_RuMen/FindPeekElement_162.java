package SuanFa_RuMen;

public class FindPeekElement_162 {
    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        if (nums.length==2){
            if (nums[0]>nums[1]){
                return 0;
            }else {
                return 1;
            }
        }
        int left = 0;
        int middle = left + 1;
        int right = middle + 1;
        int max = 0;
        int maxIndex = 0;
        if (nums[left]>nums[right]){
            max = nums[left];
            maxIndex = left;
        }else {
            max = nums[right];
            maxIndex = right;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[left]>max){
                maxIndex = left;
                max = nums[left];
            }
            if (nums[right]>max){
                maxIndex = right;
                max = nums[right];
            }
            if (nums[left] < nums[middle] && nums[middle] > nums[right]) {
                return middle;
            } else {
                left++;
                middle++;
                right++;
            }
        }
        return maxIndex;
    }
}
