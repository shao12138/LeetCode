package SuanFa_RuMen;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763 {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        partitionLabels(s);
    }

    public static List<Integer> partitionLabels(String s) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int temp = s.lastIndexOf(c);
            for (int j = i + 1; j < temp; j++) {
                char d = s.charAt(j);
                temp = Math.max(temp, s.lastIndexOf(d));
            }
            if (temp + 1 >= s.length()) {
                arrayList.add(s.length() - i);
                break;
            } else if (temp == -1) {
                arrayList.add(1);
                i++;
            } else {
                arrayList.add(temp - i + 1);
                i = temp + 1;
            }
        }
        return arrayList;
    }
}
