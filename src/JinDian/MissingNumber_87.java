package JinDian;

public class MissingNumber_87 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == 0) {
                return i;
            }
        }
        return nums.length;
    }
}
