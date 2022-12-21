package SuanFa_500;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FindMinDifference_539 {
    public static void main(String[] args) throws ParseException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("01:39");
        arrayList.add("10:26");
        arrayList.add("21:43");
        findMinDifference(arrayList);
    }

    public static int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        try {
            Object[] times = timePoints.toArray();
            ArrayList<Long> result = new ArrayList();
            Arrays.sort(times);
            for (int i = 1; i < times.length; i++) {
                Date date1 = new SimpleDateFormat("HH:mm").parse((String) times[i - 1]);
                Date date2 = new SimpleDateFormat("HH:mm").parse((String) times[i]);
                result.add((date2.getTime() - date1.getTime()) / (1000 * 60));
            }
            Date date0 = new SimpleDateFormat("HH:mm").parse((String) times[0]);
            Date date00 = new SimpleDateFormat("HH:mm").parse((String) "00:00");
            long f = date0.getTime() - date00.getTime();
            Date date1 = new SimpleDateFormat("HH:mm").parse((String) "24:00");
            Date date2 = new SimpleDateFormat("HH:mm").parse((String) times[times.length - 1]);
            f += date1.getTime() - date2.getTime();
            result.add(f / (1000 * 60));
            for (int i = 0; i < result.size(); i++) {
                min = (int) Math.min(min, result.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return min;
    }
}
