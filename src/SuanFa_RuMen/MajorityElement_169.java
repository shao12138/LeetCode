package SuanFa_RuMen;

import java.util.*;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        int k = nums.length / 2;
        Set<Integer> keys = hashMap.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (hashMap.get(a) > k) {
                return a;
            }
        }
        return 0;
    }
}
