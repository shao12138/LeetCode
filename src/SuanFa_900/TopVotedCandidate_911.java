package SuanFa_900;

import java.util.*;

public class TopVotedCandidate_911 {
    // 人获得的票数
    Map<Integer, Integer> cntMap = new HashMap<>();
    // 当前时间领先的人
    TreeMap<Integer, Integer> tm = new TreeMap<>();

    public TopVotedCandidate_911(int[] persons, int[] times) {
        int maxPersonId = -1;
        for (int i = 0; i < persons.length; i++) {
            // 人的得票增加
            int cnt = cntMap.getOrDefault(persons[i], 0) + 1;
            cntMap.put(persons[i], cnt);
            // 之前得票最多的人
            int maxCnt = cntMap.getOrDefault(maxPersonId, 0);
            if (cnt >= maxCnt) {
                maxPersonId = persons[i];
            }
            // 维护当前时间得票最多的personId
            tm.put(times[i], maxPersonId);
        }
    }

    public int q(int t) {
        return tm.floorEntry(t).getValue();
    }
}
