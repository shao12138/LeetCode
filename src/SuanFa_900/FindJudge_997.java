package SuanFa_900;

import java.util.ArrayList;
import java.util.HashMap;

public class FindJudge_997 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,3},{1,4},{2,3}};
        System.out.println(findJudge(4, a));

    }

    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer, ArrayList> hashMap = new HashMap();
        for (int i = 0; i < trust.length; i++) {
            if (hashMap.containsKey(trust[i][0])) {
                ArrayList arrayList = hashMap.get(trust[i][0]);
                arrayList.add(trust[i][1]);
                hashMap.put(trust[i][0], arrayList);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(trust[i][1]);
                hashMap.put(trust[i][0], arrayList);
            }
        }
        if (hashMap.size() == 0 && n != 1) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            if (!hashMap.containsKey(i)) {
                int count = 0;
                for (int j = 1; j <= n; j++) {
                    if (hashMap.containsKey(j)) {
                        if (!hashMap.get(j).contains(i)) {
                            break;
                        } else {
                            count++;
                        }
                    }
                }
                if (count == n-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
