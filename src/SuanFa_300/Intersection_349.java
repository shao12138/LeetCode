package SuanFa_300;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_349 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arrayList = new ArrayList();
        int left = 0;
        int right = 0;
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
               if (!arrayList.contains(nums1[left])){
                   arrayList.add(nums1[left]);
               }
                left++;
                right++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                left++;
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
