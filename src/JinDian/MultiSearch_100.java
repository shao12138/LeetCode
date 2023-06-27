package JinDian;

import java.util.ArrayList;

public class MultiSearch_100 {
    public static void main(String[] args) {
        String big = "abc";
        String[] smalls = new String[]{""};
        multiSearch(big, smalls);
    }

    public static int[][] multiSearch(String big, String[] smalls) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList();
        for (int i = 0; i < smalls.length; i++) {
            ArrayList<Integer> temp = new ArrayList();
            for (int j = 0; j < big.length(); ) {
                String small = smalls[i];
                if (small.equals("")){
                    break;
                }
                int index = big.indexOf(small, j);
                if (index != -1) {
                    temp.add(index);
                    j = index + 1;
                } else {
                    break;
                }
            }
            arrayList.add(temp);
        }
        int[][] array = new int[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList<Integer> row = arrayList.get(i);
            array[i] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = row.get(j);
            }
        }
        return array;
    }
}
