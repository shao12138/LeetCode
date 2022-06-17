package SuanFa_RuMen;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp = 0;
        while (left <= right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
            if (left==right){
                break;
            }
        }
    }
}
