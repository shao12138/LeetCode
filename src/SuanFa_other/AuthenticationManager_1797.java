package SuanFa_other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AuthenticationManager_1797 {
    int time = 0;
    HashMap<String, Integer> hashMap = new HashMap();

    public AuthenticationManager_1797(int timeToLive) {
        time = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        hashMap.put(tokenId, currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if (hashMap.containsKey(tokenId)) {
            boolean flag = hashMap.get(tokenId) > currentTime - time;
            if (flag) {
                hashMap.put(tokenId, currentTime);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        Set<String> keys = hashMap.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (hashMap.get(key) > currentTime - time) {
                count++;
            }
        }
        return count;
    }
}
