package JinDian;

public class IsFlipedString_9 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        isFlipedString(s1, s2);
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals("")) {
            return true;
        }
        for (int i = 0; i < s1.length(); i++) {
            String temp = s1.substring(i) + s1.substring(0, i);
            if (temp.equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
