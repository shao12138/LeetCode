package SuanFa_RuMen;

public class IntToRoman_12 {
    public static void main(String[] args) {
        intToRoman(10);
    }

    public static String intToRoman(int num) {
        int a1 = num / 1000;
        int b1 = num % 1000;
        int a2 = b1 / 500;
        int b2 = b1 % 500;
        int a3 = b2 / 100;
        int b3 = b2 % 100;
        int a4 = b3 / 50;
        int b4 = b3 % 50;
        int a5 = b4 / 10;
        int b5 = b4 % 10;
        int a6 = b5 / 5;
        int b6 = b5 % 5;
        String result = "";
        if (a1 != 0) {
            for (int i = 0; i < a1; i++) {
                result += "M";
            }
        }
        if (a2 != 0) {
            result += "D";
        }
        if (a3 != 0) {
            if (a3 == 4) {
                result += "CD";
            } else {
                for (int i = 0; i < a3; i++) {
                    result += "C";
                }
            }
        }
        if (a4 != 0) {
            result += "L";
        }
        if (a5 != 0) {
            if (a5 == 4) {
                result += "XL";
            } else {
                for (int i = 0; i < a5; i++) {
                    result += "X";
                }
            }
        }
        if (a6 != 0) {
            result += "V";
        }
        if (b6 != 0) {
            if (b6 == 4) {
                result += "IV";
            } else {
                for (int i = 0; i < b6; i++) {
                    result += "I";
                }
            }
        }
        String f = "";
        if (result.length() >= 3) {
            int i =0;
            for (; i < result.length() - 2; ) {
                String middle = result.substring(i, i + 3);
                if (middle.equals("DCD")) {
                    f += "CM";
                    i += 3;
                } else if (middle.equals("LXL")) {
                    f += "XC";
                    i += 3;
                } else if (middle.equals("VIV")) {
                    f += "IX";
                    i += 3;
                } else {
                    f += result.charAt(i);
                    i += 1;
                }
            }
            for (; i < result.length(); i++) {
                f += result.charAt(i);
            }
        } else {
            f = result;
        }
        return f;
    }
}
