package Offer;

import java.util.HashMap;
import java.util.Iterator;

public class RandomizedSet_30 {
    HashMap<Integer, Integer> hashMap;

    public RandomizedSet_30() {
        hashMap = new HashMap();
    }

    public boolean insert(int val) {
        hashMap.put(val, 0);
        return !hashMap.containsKey(val);
    }

    public boolean remove(int val) {
        hashMap.remove(val);
        return hashMap.containsKey(val);
    }

    public int getRandom() {
        Iterator<Integer> iter = hashMap.keySet().iterator();
        int n = (int) (Math.random() * hashMap.size());
        int index = 0;
        int result = 0;
        while (index < n && iter.hasNext()) {
            result = iter.next();
            index++;
        }
        return result;
    }
}
