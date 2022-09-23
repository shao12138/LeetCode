package SuanFa_800;

import java.util.HashMap;

public class LlemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        hashMap.put(5, 0);
        hashMap.put(10, 0);
        for (int i = 0; i < bills.length; i++) {
            int temp = bills[i];
            if (temp == 10) {
                if (hashMap.get(5) >= 1) {
                    hashMap.put(5, hashMap.get(5) - 1);
                    hashMap.put(10, hashMap.get(10) + 1);
                } else {
                    return false;
                }
            } else if (temp == 20) {
                if (hashMap.get(5) >= 1 && hashMap.get(10) >= 1) {
                    hashMap.put(5, hashMap.get(5) - 3);
                } else if (hashMap.get(5) >= 3) {
                    hashMap.put(5, hashMap.get(5) - 1);
                    hashMap.put(10, hashMap.get(10) - 1);
                } else {
                    return false;
                }
            } else {
                hashMap.put(5, hashMap.get(5) + 1);
            }
        }
        return true;
    }
}
