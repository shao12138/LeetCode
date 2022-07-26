package SuanFa_RuMen;

import org.omg.CORBA.ARG_IN;

import java.util.ArrayList;
import java.util.List;

public class Generate_118 {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList<>();
        ArrayList a = new ArrayList();
        a.add(1);
        arrayList.add(a);
        for (int i = 1; i < numRows; i++) {
            ArrayList temp = new ArrayList();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(arrayList.get(i - 1).get(j - 1) + arrayList.get(i - 1).get(j));
            }
            temp.add(1);
            arrayList.add(temp);
        }
        return arrayList;
    }
}
