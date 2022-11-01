package SuanFa_900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap_981 {
    HashMap<String, List<Node>> map;

    public TimeMap_981() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Node(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<Node> list = map.get(key);
        if (timestamp < list.get(0).timestamp) return "";
        if (timestamp >= list.get(list.size() - 1).timestamp) return list.get(list.size() - 1).val;
        int l = 0, r = list.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (timestamp >= list.get(m).timestamp && timestamp < list.get(m + 1).timestamp) {
                return list.get(m).val;
            } else if (timestamp < list.get(m).timestamp) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return "";
    }

    static class Node {
        int timestamp;
        String val;

        public Node(int timestamp, String val) {
            this.timestamp = timestamp;
            this.val = val;
        }
    }
}
