package SuanFa_400;

public class RepeatedSubstringPattern_459 {
    public static void main(String[] args) {
        String s = "abaababaab";
        repeatedSubstringPattern(s);
    }

    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            String temp = s.substring(0, i);
            boolean flag = true;
            if (s.length() % i == 0) {
                for (int j = i; j <= s.length() - i; j += i) {
                    String temp2 = s.substring(j, j + i);
                    if (!temp.equals(temp2)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
