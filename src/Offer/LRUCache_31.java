package Offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LRUCache_31 {
    HashMap<Integer, Integer> hashMap;
    int capacity = 0;
    HashMap<Integer, Integer> times;
    int index = 1;

    public LRUCache_31(int capacity) {
        hashMap = new HashMap<>();
        times = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            times.put(key, index++);
            return hashMap.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            hashMap.put(key, value);
        } else {
            if (hashMap.size() == capacity) {
                int id = 0;
                int min = Integer.MAX_VALUE;
                Set<Integer> keys = times.keySet();
                Iterator<Integer> iterator = keys.iterator();
                while (iterator.hasNext()) {
                    int t = iterator.next();
                    if (times.get(t) < min) {
                        id = t;
                        min = times.get(t);
                    }
                }
                hashMap.remove(id);
                times.remove(id);
            }
            hashMap.put(key, value);
        }
        times.put(key, index++);
    }

    public static void main(String[] args) {
        LRUCache_31 a = new LRUCache_31(2);
        a.put(2, 1);
        a.put(1, 1);
        a.put(2, 3);
        a.put(4, 1);
        System.out.println(a.get(1));
        System.out.println(a.get(2));
    }
}
