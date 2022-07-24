package SuanFa_RuMen;

public class Merge_88 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        int[] b = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(a, m, b, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int i = 0;
        for (; i < n && left < nums1.length-1; ) {
            if (nums1[left] < nums2[i]) {
                left++;
            } else {
                for (int j = nums1.length - 1; j > left; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[left] = nums2[i];
                i++;
            }
        }
        for (int k = i; k < n; k++) {
            nums1[m + k] = nums2[k];
        }
        System.out.println("");
    }
}
