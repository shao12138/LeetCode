package SuanFa_RuMen;

import java.util.ArrayList;

public class Convert_6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        convert(s, numRows);
    }

    public static String convert(String s, int numRows) {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < numRows; i++) {
            arrayList.add(new ArrayList<String>());
        }
        char[] c = s.toCharArray();
        int temp = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            arrayList.get(temp).add(String.valueOf(c[i]));
            if (flag == true) {
                if (temp < numRows - 1) {
                    temp++;
                }
                if (temp == numRows - 1) {
                    flag = false;
                }
            } else {
                if (temp > 0) {
                    temp--;
                }
                if (temp == 0) {
                    flag = true;
                }
            }
        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                result += arrayList.get(i).get(j);
            }
        }
        return result;
    }
}
