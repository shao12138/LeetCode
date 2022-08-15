package SuanFa_300;

import java.util.*;

public class Solution_384 {
    int[] nums_main;
    int[] nums_start;
    int n;
    List<Integer> output = new ArrayList<Integer>();

    public Solution_384(int[] nums) {
        nums_main = nums.clone();
        nums_start = nums.clone();
        n = nums.length;
        for (int num : nums) {
            output.add(num);
        }

    }

    public int[] reset() {
        return nums_start;
    }

    public int[] shuffle() {
        Collections.shuffle(output);
        int[] result = new int[n];
        for (int i=0;i<n;i++){
            result[i] = output.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution_384 a = new Solution_384(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(a.shuffle());
    }
}
