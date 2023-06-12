package JinDian;

import java.util.ArrayList;
import java.util.List;

public class GetValidT9Words_80 {
    static String[] c = new String[8];

    public static void main(String[] args) {
        String num = "2";
        String[] words = new String[]{"a", "b", "c", "d"};
        getValidT9Words(num, words);
    }

    public static List<String> getValidT9Words(String num, String[] words) {
        c[0] = "abc";
        c[1] = "def";
        c[2] = "ghi";
        c[3] = "jkl";
        c[4] = "mno";
        c[5] = "pqrs";
        c[6] = "tuv";
        c[7] = "wxyz";
        ArrayList result = new ArrayList();
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            flag = true;
            for (int j = 0; j < temp.length(); j++) {
                int index = num.charAt(j) - '0';
                if (!c[index - 2].contains(String.valueOf(temp.charAt(j)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(temp);
            }
        }
        return result;
    }
}
