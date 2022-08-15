package SuanFa_1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        Set s = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        int temp = s.size();
        int q = 0;
        for (int i = 0; i < nums.length && q < temp; i++) {
            int start = 0;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    start++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < nums.length - start; j++) {
                nums[j] = nums[j + start];
            }
            q++;
        }
        return q;
    }
}
