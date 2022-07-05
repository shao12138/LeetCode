package SuanFa_RuMen;

public class Jump_45 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 1, 4, 4};
        jump(a);
    }

    public static int jump(int[] nums) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; ) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < nums[i]; j++) {
                max = Math.max(max, nums[i + j + 1]);
            }
            i = Math.max(i, i + nums[i] + max);
            count++;
        }
        return count;
    }
}
