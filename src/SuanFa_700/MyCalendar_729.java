package SuanFa_700;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar_729 {
    List<int[]> booked;

    public MyCalendar_729() {
        booked = new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                return false;
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }
}
