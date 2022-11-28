package Offer;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence_57 {
    public int[][] findContinuousSequence(int target) {
        //思路，双指针
        //刚开始 left 在位置 1， right 在位置 2， 定义左右指针之间的数字和为 sum = n*(a1+an)/2
        //1.类似二分查找的逻辑，当 sum 等于 target 时，将左右指针之间的这种数组加入结果，然后左指针右移
        //2.当 sum 小于 target 时，右指针右移增大 sum
        //3.当 sum 大于 target 时，说明以 left 为起点组成的数组不符要求，左指针右移

        //创建结果数组
        List<int[]> list = new ArrayList<>();

        int left = 1;
        int right = 2;
        //终止条件是左指针移动到右指针位置，说明此时已经不存在两个数之和能小于 target 了
        while (left < right) {
            int sum = (right - left + 1) * (left + right) / 2;
            if (sum == target) {
                //创建数组存储左右指针之间的数组组合
                int[] tmp = new int[right - left + 1];

                for (int i = 0; i < right - left + 1; i++) {
                    tmp[i] = left + i;
                }

                //将临时数组结果存储入List
                list.add(tmp);

                //继续探索下一种方案
                ++left;
            }else if (sum<target){
                ++right;
            }else {
                ++left;
            }
        }
        //掌握此种二维list转数组方法
        return list.toArray(new int[list.size()][]);
    }
}
