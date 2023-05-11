package JinDian;

import java.util.HashMap;

public class WordsFrequency_63 {
    HashMap<String, Integer> hashMap = null;

    public WordsFrequency_63(String[] book) {
        hashMap = new HashMap<String, Integer>();
        for (String str : book) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }
    }

    public int get(String word) {
        if (hashMap.containsKey(word)) {
            return hashMap.get(word);
        } else {
            return 0;
        }
    }
}
