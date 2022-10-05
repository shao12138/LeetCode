package SuanFa_500;

public class SingleNonDuplicate_540 {
    public int singleNonDuplicate(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }
}
