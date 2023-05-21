package JinDian;

import java.util.TreeSet;

public class DivingBoard_72 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k==0){
            return new int[]{};
        }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i <= k; i++) {
            set.add(i * shorter + (k - i) * longer);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int x : set) {
            result[index++] = x;
        }
        return result;
    }
}
