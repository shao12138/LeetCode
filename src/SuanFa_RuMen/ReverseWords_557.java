package SuanFa_RuMen;

public class ReverseWords_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] t = s.split(" ");
        String result = "";
        for (int i = 0; i < t.length; i++) {
            if (i == t.length - 1) {
                result += reverseString(t[i]);
            } else {
                result += reverseString(t[i]) + " ";
            }
        }
        return result;
    }

    public static String reverseString(String string) {
        char[] s = string.toCharArray();
        int left = 0;
        int right = s.length - 1;
        char temp = 0;
        while (left <= right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
            if (left == right) {
                break;
            }
        }
        return String.valueOf(s);
    }
}
