package SuanFa_600;

import java.util.Arrays;

public class TriangleNumber_611 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 3, 4};
        System.out.println(triangleNumber(nums));
    }

    public static int triangleNumber(int[] nums) {
        int count = 0;
        if (nums.length == 1 || nums.length == 2) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != 0) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = nums.length - 1; k >= i + 2; k--) {
                        if (nums[i] + nums[j] > nums[k]) {
                            count += k - j;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}
