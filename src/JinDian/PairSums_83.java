package JinDian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairSums_83 {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 6, 5};
        int target = 11;
        pairSums(nums, target);
    }

    public static List<List<Integer>> pairSums(int[] nums, int target) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hashMap.containsKey(i) && hashMap.get(i) > 0 && hashMap.containsKey(target - i) && hashMap.get(target - i) > 0) {
                if (target == 2 * i && hashMap.get(i) < 2) {
                    break;
                }
                result.add(Arrays.asList(i, target - i));
                if (hashMap.get(i) == 1) {
                    hashMap.remove(i);
                } else {
                    hashMap.put(i, hashMap.get(i) - 1);
                }
                if (hashMap.get(target - i) == 1) {
                    hashMap.remove(target - i);
                } else {
                    hashMap.put(target - i, hashMap.get(target - i) - 1);
                }
            }
        }
        return result;
    }
}
