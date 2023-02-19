package SuanFa_1300;

public class LongestPrefix_1392 {
    public static void main(String[] args) {
        String s = "ababab";
        longestPrefix(s);
    }

    public static String longestPrefix(String s) {
        String result = "";
        int length = s.length();
        int left = 0;
        int right = length / 2;
        while (left < right) {
            int middle = (left + right) / 2;
            String a = s.substring(0, middle);
            String b = s.substring(s.length() - middle, s.length());
            if (a.equals(b)) {
                result = a;
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return result;
    }

}
