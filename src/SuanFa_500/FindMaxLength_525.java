package SuanFa_500;

import java.util.HashMap;
import java.util.Map;

public class FindMaxLength_525 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 0, 0, 0, 1, 1};
        findMaxLength(nums);
    }

    public static int findMaxLength(int[] nums) {
        /**
         将数组中的0换成-1， 求和为0的最长子数组 转换成前缀和问题
         */
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 0) nums[i] = -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0, sum = 0;
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum));
            }else map.put(sum, i);
        }
        return ans;
    }
}
