package Offer;

import java.util.ArrayList;

public class ReverseWords_58 {
    public static void main(String[] args) {
        String str = " ";
        reverseWords(str);
    }

    public static String reverseWords(String s) {
        if (s.equals("")) {
            return "";
        }
        String[] result = s.split(" ");
        ArrayList<String> arrayList = new ArrayList();
        for (String str : result) {
            if (!str.contains(" ") && !str.equals("")) {
                arrayList.add(str);
            }
        }
        int left = 0;
        int right = arrayList.size() - 1;
        while (left < right) {
            String temp = arrayList.get(left);
            arrayList.set(left, arrayList.get(right));
            arrayList.set(right, temp);
            left++;
            right--;
        }
        String r = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                r += arrayList.get(i);
            } else {
                r += arrayList.get(i) + " ";
            }
        }
        return arrayList.toString();
    }
}