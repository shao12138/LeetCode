package SuanFa_1800;

public class ArraySign_1822 {
    public static void main(String[] args) {
        int[] nums = new int[]{41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41};
        arraySign(nums);
    }

    public static int arraySign(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                return 0;
            }else if (nums[i]>0){
                result*=1;
            }else if (nums[i]<0){
                result*=-1;
            }
        }
        return result;
    }
}
