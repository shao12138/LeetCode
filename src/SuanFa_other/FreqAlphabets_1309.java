package SuanFa_other;

public class FreqAlphabets_1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        while (s.contains("#")) {
            int i = s.indexOf("#");
            String t = s.substring(i - 2, i + 1);
            String t2 = s.substring(i - 2, i);
            s = s.replace(t, (char) (Integer.parseInt(t2) + 96) + "");
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= '1' && temp <= '9') {
                result += (char) (Integer.parseInt(temp + "") + 96);
            } else {
                result += temp;
            }
        }
        return result;
    }
}
