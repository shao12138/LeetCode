package Offer;

public class StrToInt_67 {
    public static void main(String[] args) {
        String str = "    +0a32";
        strToInt(str);
    }

    public static int strToInt(String str) {
        str = str.trim();
        if (str.equals("")) {
            return 0;
        }
        String temp = "";
        int i = 0;
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            temp += str.charAt(i);
            i++;
        }
        for (; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a >= 48 && a <= 57) {
                temp += String.valueOf(a);
            } else {
                break;
            }
        }
        if (temp.equals("") || temp.equals("+") || temp.equals("-")) {
            return 0;
        }
        int index = 1;
        if (temp.charAt(0) == 48 || temp.charAt(0) == '-' || temp.charAt(0) == '+') {
            for (int j = 1; j < temp.length(); j++) {
                if (temp.charAt(j) == 48) {
                    index++;
                } else {
                    break;
                }
            }
        }
        if (temp.charAt(0) == '+') {
            temp = temp.substring(index);
        } else {
            temp = temp.charAt(0) + temp.substring(index);
        }
        if (temp.equals("") || temp.equals("+") || temp.equals("-")) {
            return 0;
        }
        if (temp.length() > 19) {
            return temp.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (temp.length() > 19) {
            return temp.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        Long s = Long.parseLong(temp);
        if (s > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (s < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(temp);
    }
}
