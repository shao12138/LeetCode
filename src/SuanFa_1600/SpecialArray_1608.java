package SuanFa_1600;

public class SpecialArray_1608 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5};
        specialArray(nums);
    }

    public static int specialArray(int[] nums) {
        for (int x = 0; x <= nums.length; x++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]>=x){
                    count++;
                }
            }
            if (count==x){
                return x;
            }
        }
        return -1;
    }
}
