package SuanFa_RuMen;

import java.util.ArrayList;

public class LengthOfLongestSubstring_3 {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        ArrayList a = new ArrayList();
        int max = 0;
        for (int i = 0; i < c.length; i++) {
            int max_temp = 1;
            a.add(c[i]);
            for (int j=i+1;j<c.length;j++){
                if (a.contains(c[j])){
                    break;
                }else {
                    max_temp++;
                    a.add(c[j]);
                }
            }
            if (max_temp>max){
                max = max_temp;
            }
            a.clear();
        }
        return max;
    }
}
