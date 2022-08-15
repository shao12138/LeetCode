package SuanFa_1;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"cir","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int index = Integer.MAX_VALUE;
        int count = 0;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs.length; i++) {
            index = Math.min(index, strs[i].length());
        }
        for (int j = 0; j < index; j++) {
            char start = strs[0].charAt(j);
            int temp = 0;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) == start) {
                    temp++;
                }
            }
            if (temp == strs.length - 1) {
                count++;
            }else {
                break;
            }
        }
        if (count > 0 && count <= index) {
            return strs[0].substring(0, count);
        } else {
            return "";
        }
    }
}
