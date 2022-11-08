package Offer;

public class FindRepeatNumber_3 {
    public int findRepeatNumber(int[] nums) {
        int[] count = new int[nums.length];
        int num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }
        return num;
    }
}
