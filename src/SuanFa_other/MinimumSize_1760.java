package SuanFa_other;

public class MinimumSize_1760 {
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean canDivide(int nums[], int maxOperations, int cost) {
        int op = 0;
        for (int i = 0; i < nums.length; i++) {
            op += (nums[i] - 1) / cost;
        }
        return op <= maxOperations;
    }
}
