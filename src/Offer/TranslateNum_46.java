package Offer;

public class TranslateNum_46 {
    public static void main(String[] args) {
        translateNum(18580);
    }

    public static int translateNum(int num) {
        String s = num + "";
        int n = s.length();
        int a = 1;
        if (n == 1) {
            return a;
        }
        int b;
        if (Integer.parseInt(s.substring(0, 2)) <= 25&&Integer.parseInt(s.substring(0, 2))>=10) {
            b = 2;
        } else {
            b = 1;
        }
        if (n == 2) {
            return b;
        }
        int result = b;
        for (int i = 3; i <= n; i++) {
            String temp = s.substring(i - 2, i);
            if (Integer.parseInt(temp) <= 25 && Integer.parseInt(temp) >= 10) {
                result = (a + b);
            }
            a = b;
            b = result;
        }
        return result;
    }
}
