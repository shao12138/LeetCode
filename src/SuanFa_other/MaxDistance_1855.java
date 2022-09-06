package SuanFa_other;

public class MaxDistance_1855 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{55, 30, 5, 4, 2};
        int[] nums2 = new int[]{100, 20, 10, 10, 5};
        maxDistance(nums1, nums2);
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int result = 0;
        while (left < nums1.length && right < nums2.length) {
            if (left < right && nums1[left] <= nums2[right]) {
                result = Math.max(result, right - left);
                right++;
            } else if (left < right && nums1[left] > nums2[right]) {
                left++;
            } else if (left > right) {
                right++;
            } else if (left == right && nums1[left] <= nums2[right]) {
                result = Math.max(result, right - left);
                right++;
            } else if (left == right && nums1[left] > nums2[right]) {
                left++;
            }
        }
        return result;
    }
}
