import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        char[] ans = s.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(s);
            return;
        }
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                idx1 = i;
                idx2 = n - i - 1;
                break;
            }
        }
        boolean found = false;
        for (char c = 'a'; c <= 'c'; c++) {
            ans[idx1] = c;
            if (checkPalindrome(ans)) {
                found = true;
                break;
            }
        }
        if (!found) {
            for (char c = 'a'; c <= 'c'; c++) {
                ans[idx2] = c;
                if (checkPalindrome(ans)) {
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            ans[idx1] = ans[idx2] = 'a';
        }
        System.out.println(new String(ans));
    }

    private static boolean checkPalindrome(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != s[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
