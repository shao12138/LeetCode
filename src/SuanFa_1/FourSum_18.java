package SuanFa_1;

import java.util.*;

public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int a) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <= 2) return ans;
        Arrays.sort(nums); // O(nlogn)
        long target = a;
        for (int i = 0; i < nums.length - 3; i++) { // O(n^2)
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                long newtarget = target - nums[i] - nums[j];
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int cur = nums[left] + nums[right];
                    if (cur == newtarget) {
                        ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--; // 首先无论如何先要进行加减操作
                    } else if (cur < newtarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
