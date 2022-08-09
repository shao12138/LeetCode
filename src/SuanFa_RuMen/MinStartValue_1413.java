package SuanFa_RuMen;

public class MinStartValue_1413 {
    public static void main(String[] args) {
        int a[] = new int[]{1, -2, -3};
        minStartValue(a);
    }

    public static int minStartValue(int[] nums) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum < 1) {
                result += 1;
                sum += 1;
            }
        }
        if (result==0){
            return 1;
        }
        return result;
    }
}
