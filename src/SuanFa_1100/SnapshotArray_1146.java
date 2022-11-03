package SuanFa_1100;

import java.util.HashMap;
import java.util.TreeMap;

public class SnapshotArray_1146 {
    int[] num;
    int count = 0;
    TreeMap<Integer, HashMap<Integer, Integer>> hashMap = new TreeMap<>();
    HashMap<Integer, Integer> temp = new HashMap<>();

    public SnapshotArray_1146(int length) {
    }

    public void set(int index, int val) {
        temp.put(index, val);
    }

    public int snap() {
        hashMap.put(count, (HashMap<Integer, Integer>) temp.clone());
        count++;
        return count - 1;
    }

    public int get(int index, int snap_id) {
        if (hashMap.containsKey(snap_id)) {
            HashMap<Integer, Integer> temp = hashMap.get(snap_id);
            if (temp.containsKey(index)) {
                return temp.get(index);
            } else {
                return 0;
            }
        } else {
            HashMap<Integer, Integer> temp = hashMap.floorEntry(snap_id).getValue();
            if (temp.containsKey(index)) {
                return temp.get(index);
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        SnapshotArray_1146 s = new SnapshotArray_1146(1);
        s.set(0, 15);
        s.snap();
        s.snap();
        s.snap();
        s.get(0, 2);
        s.snap();
        s.snap();
        s.get(0, 0);
    }
}
