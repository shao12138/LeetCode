package Offer;

import java.util.regex.Pattern;

public class IsNumber_20 {
    public static void main(String[] args) {
        String s = "e";
        isNumber(s);
    }

    public static boolean isNumber(String s) {
        boolean result = false;
        String temp = s.trim();
        String[] model = new String[]{
                "[+-]?\\d+", "[+-]?[0-9]+[.]?[Ee][+-]?\\d+",
                "[+-]?\\d+[.]\\d*", "[+-]?\\d+[.]\\d+[Ee]?[+-]?\\d+", "[+-]?[.]\\d+[Ee]?[+-]?\\d+", "[+-]?[.]\\d"};
        for (String m : model) {
            Pattern p = Pattern.compile(m);
            result = result | p.matcher(temp).matches();
        }
        return result;

    }
}
