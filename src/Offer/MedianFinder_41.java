package Offer;

import java.util.ArrayList;
import java.util.Collections;

public class MedianFinder_41 {
    ArrayList<Double> arrayList;

    public MedianFinder_41() {
        arrayList = new ArrayList<>();
    }

    public void addNum(int num) {
        arrayList.add((double) num);
    }

    public double findMedian() {
        Collections.sort(arrayList);
        int length = arrayList.size();
        if (length % 2 == 0) {
            return (arrayList.get(length / 2) + arrayList.get(length / 2 + 1)) / 2;
        } else {
            return arrayList.get(length / 2 + 1);
        }
    }
}
