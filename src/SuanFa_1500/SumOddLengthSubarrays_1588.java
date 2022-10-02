package SuanFa_1500;

public class SumOddLengthSubarrays_1588 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 2, 5, 3};
        sumOddLengthSubarrays(nums);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            int temp = 0;
            for (int j = 0; j <= arr.length - i; j++) {
                for (int k = 0; k < i; k++) {
                    temp += arr[j+k];
                }
            }
            result+=temp;
        }
        return result;
    }
}
