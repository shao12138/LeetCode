package SuanFa_1;

public class StrStr_28 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "c";
        strStr(a, b);
    }

    public static int strStr(String haystack, String needle) {
        char start = needle.charAt(0);
        int length1 = haystack.length();
        int length2 = needle.length();
        if (haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i <= length1 - length2; i++) {
            if (haystack.charAt(i) == start) {
                int count = 0;
                for (int j = 0; j < length2; j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == length2) {
                    return i;
                }
            }
        }
        return 0;
    }
}
