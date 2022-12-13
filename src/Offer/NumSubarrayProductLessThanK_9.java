package Offer;

public class NumSubarrayProductLessThanK_9 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // 滑动窗口：寻找以每个 right 指针为右边界的有效连续子树组的个数
        int length = nums.length;
        int product = 1;
        int cnt = 0;
        int left = 0, right = 0;
        while (right < length) {
            product *= nums[right++];

            while (left < right && product >= k) {
                product /= nums[left++];
            }

            cnt += (right - left);
        }

        return cnt;
    }
}
