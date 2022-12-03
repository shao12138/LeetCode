package Offer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsMatch_19 {
    public boolean isMatch(String s, String p) {
        Pattern pat = Pattern.compile(p);
        Matcher m = pat.matcher(s);
        return m.matches();
    }
}
