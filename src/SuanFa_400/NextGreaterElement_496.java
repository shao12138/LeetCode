package SuanFa_400;

public class NextGreaterElement_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            result[i] = nums2[k];
                            break;
                        } else {
                            result[i] = -1;
                        }
                    }
                }
            }
        }
        return result;
    }
}
