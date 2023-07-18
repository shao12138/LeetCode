package SuanFa_200;

import java.util.TreeSet;

public class ContainsNearbyDuplicate_219 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        containsNearbyDuplicate(nums, 2);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i]);
            if (ceiling != null && ceiling <= (long) nums[i]) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
