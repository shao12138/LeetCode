package SuanFa_RuMen;

public class NumSubarrayProductLessThanK_713 {
    public static void main(String[] args) {
        int[] a = new int[]{10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(a, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
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
