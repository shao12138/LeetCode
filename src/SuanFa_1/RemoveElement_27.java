package SuanFa_1;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] a = new int[]{4, 4, 0, 1, 0, 2};
        removeElement(a, 0);
    }

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                num++;
            }
        }
        int count = length - num;
        for (int k = 0; k < num; k++) {
            for (int i = 0; i < length; i++) {
                if (nums[i] == val) {
                    for (int j = i; j < length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[length - 1] = 0;
                }
            }
        }
        return count;
    }
}
