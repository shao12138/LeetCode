package Offer;

import java.util.ArrayList;

public class RecentCounter_42 {
    ArrayList<Integer> arrayList;

    public RecentCounter_42() {
        arrayList = new ArrayList();
    }

    public int ping(int t) {
        int sum = 0;
        arrayList.add(t);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= t & arrayList.get(i) >= t - 3000) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RecentCounter_42 a = new RecentCounter_42();
        a.ping(1);
        a.ping(100);
        a.ping(3001);
        a.ping(3002);
    }
}
