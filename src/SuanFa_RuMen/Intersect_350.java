package SuanFa_RuMen;

import java.util.ArrayList;

public class Intersect_350 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 9, 5};
        int[] b = new int[]{9, 4, 9, 8, 4};
        intersect(a, b);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        ArrayList<Integer> a = new ArrayList();
        if (length1 > length2) {
            for (int i = 0; i < length2; i++) {
                for (int j = 0; j < length1; j++) {
                    if (nums2[i] == nums1[j]) {
                        a.add(nums2[i]);
                        nums1[j] = -1;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < length1; i++) {
                for (int j = 0; j < length2; j++) {
                    if (nums1[i] == nums2[j]) {
                        a.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        }
        int result[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        return result;
    }
}
