package JinDian;

import java.util.HashSet;
import java.util.Set;

public class FindSwapValues_81 {
    public static void main(String[] args) {
        int[] array1 = new int[]{519, 886, 282, 382, 662, 4718, 258, 719, 494, 795};
        int[] array2 = new int[]{52, 20, 78, 50, 38, 96, 81, 20};
        findSwapValues(array1, array2);
    }

    public static int[] findSwapValues(int[] array1, int[] array2) {
        int sum1 = 0, sum2 = 0;
        for (int num : array1) {
            sum1 += num;
        }
        for (int num : array2) {
            sum2 += num;
        }
        int diff = sum1 - sum2;
        if (diff % 2 != 0) { // 如果两个数组的总和之差为奇数，则不可能找到符合条件的数值
            return new int[0];
        }
        diff /= 2; // 将差值除以2，这样就可以在第二个数组中找到一个数值，使得交换后两个数组的总和相等
        Set<Integer> set = new HashSet<>();
        for (int num : array2) {
            set.add(num);
        }
        for (int num : array1) {
            if (set.contains(num - diff)) {
                return new int[]{num, num - diff};
            }
        }
        return new int[0];
    }
}
