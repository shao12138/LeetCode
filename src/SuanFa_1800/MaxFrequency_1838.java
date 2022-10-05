package SuanFa_1800;

import java.util.Arrays;

public class MaxFrequency_1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int res = 1;
        int sum = 0;
        while (right < nums.length) {
            sum += (nums[right] - nums[right - 1]) * (right - left);
            while (sum > k) {
                sum -= nums[right] - nums[left];
                left += 1;
            }
            res = Math.max(res, right - left + 1);
            right += 1;

        }
        return res;
    }
}
