package JinDian;

import java.util.ArrayList;

public class StreamRank_60 {
    ArrayList<Integer> arrayList;

    public StreamRank_60() {
        arrayList = new ArrayList();
    }

    public void track(int x) {
        arrayList.add(x);
    }

    public int getRankOfNumber(int x) {
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= x) {
                result++;
            }
        }
        return result;
    }
}
