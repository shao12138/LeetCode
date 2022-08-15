package SuanFa_100;

import java.util.ArrayList;
import java.util.List;

public class GetRow_119 {
    public static void main(String[] args) {
        getRow(3);
    }
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        b.add(1);
        a.add(b);
        for (int i = 1; i < rowIndex; i++) {
            b = new ArrayList();
            b.add(1);
            for (int j = 1; j < i-1; j++) {
                b.add(a.get(i - 1).get(j - 1) + a.get(i - 1).get(j));
            }
            b.add(1);
            a.add(b);
        }
        return a.get(rowIndex);
    }
}
