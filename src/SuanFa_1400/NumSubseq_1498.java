package SuanFa_1400;

import java.util.Arrays;

public class NumSubseq_1498 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 6, 7};
        int target = 9;
        numSubseq(nums, target);
    }

    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1000000007;
        int[] tmp = new int[n];
        tmp[0] = 1;
        for (int i = 1; i < n; i++) {
            tmp[i] = (tmp[i - 1] << 1) % mod;
        }
        int res = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + tmp[r - l]) % mod;
                l++;
            }
        }
        return res;
    }
}
