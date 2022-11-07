package SuanFa_1500;

public class FindKthBit_1545 {
    public static void main(String[] args) {
        int n = 4;
        int k = 11;
        System.out.println(findKthBit(n, k));
    }

    public static char findKthBit(int n, int k) {
        int times = 0;
        int i = 0;
        for (; i < n; i++) {
            times = 2 * times + 1;
            if (times >= k) {
                break;
            }
        }
        String result = "0";
        for (int j = 0; j < i; j++) {
            String temp = result;
            temp = temp.replaceAll("0", "a");
            temp = temp.replaceAll("1", "0");
            temp = temp.replaceAll("a", "1");
            temp = reverseString(temp);
            result += "1" + temp;
        }
        return result.charAt(k - 1);
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
