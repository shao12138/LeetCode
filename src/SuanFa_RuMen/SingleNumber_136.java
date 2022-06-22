package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.Collections;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
