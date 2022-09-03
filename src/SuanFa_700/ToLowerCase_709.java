package SuanFa_700;

public class ToLowerCase_709 {
    public static void main(String[] args) {
        char A = 'A';
        char a = (char) (A + 32);
        System.out.println(a);
    }

    public String toLowerCase(String s) {
        char[] c = s.toCharArray();
        String result = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 65 && c[i] <= 90) {
                result += (char) (c[i] + 32);
            }else {
                result += c[i];
            }
        }
        return result;
    }
}
