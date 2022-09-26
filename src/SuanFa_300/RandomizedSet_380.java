package SuanFa_300;

import java.util.HashMap;
import java.util.Iterator;

public class RandomizedSet_380 {
    HashMap<Integer, Integer> hashMap;

    public RandomizedSet_380() {
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
