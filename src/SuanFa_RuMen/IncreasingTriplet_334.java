package SuanFa_RuMen;

import java.util.*;

public class IncreasingTriplet_334 {
    public boolean increasingTriplet(int[] nums) {
        int a = 2147483647, b = a;
        for (int n : nums)
            if (n <= a) a = n;
            else if (n <= b) b = n;
            else return true;
        return false;
    }
}
