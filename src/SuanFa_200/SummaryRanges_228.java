package SuanFa_200;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        summaryRanges(nums);
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<String>();
        if (nums.length == 0) {
            return result;
        }
        int index = 0;
        int temp = nums[index];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] - nums[i - 1] == 1) {

            } else {
                if (nums[index] == nums[i - 1]) {
                    result.add(nums[index] + "");
                } else {
                    result.add(nums[index] + "->" + nums[i - 1]);
                }
                index = i;
            }
        }
        if (nums[index] == nums[length - 1]) {
            result.add(nums[index] + "");
        } else {
            result.add(nums[index] + "->" + nums[length - 1]);
        }
        return result;
    }
}
