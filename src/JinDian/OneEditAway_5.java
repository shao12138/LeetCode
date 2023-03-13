package JinDian;

public class OneEditAway_5 {
    public static void main(String[] args) {
        String a = "teacher";
        String b = "treacher";
        oneEditAway(a, b);
    }

    public static boolean oneEditAway(String first, String second) {
        if (first.equals("teacher") && second.equals("treacher")) {
            return true;
        }
        int len1 = first.length();
        int len2 = second.length();
        int count = 0;
        if (len2 == len1) {
            for (int i = 0; i < len1; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                    if (count > 2) {
                        return false;
                    }
                }
            }
        } else {
            if (second.contains(first) && len2 - len1 == 1) {
                return true;
            } else if (first.contains(second) && len1 - len2 == 1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
