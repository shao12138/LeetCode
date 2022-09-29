package SuanFa_800;

public class MinEatingSpeed_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (canEat(piles, h, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean canEat(int[] piles, int h, int mid) {
        int result = 0;
        for (int i = 0; i < piles.length; i++) {
            result += piles[i] % mid == 0 ? piles[i] / mid : piles[i] / mid + 1;
        }
        return result <= h;
    }
}
