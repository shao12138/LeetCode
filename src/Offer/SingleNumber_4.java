package Offer;

public class SingleNumber_4 {
    public int singleNumber(int[] nums) {
        int[] k = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                k[i] += num & 1;
                num >>= 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res |= (k[i] % 3) << i;
        }
        return res;
    }
}
