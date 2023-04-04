package JinDian;

public class ReverseBits_36 {
    public static void main(String[] args) {
        int s = 0;
        System.out.println(reverseBits(s));
    }

    public static int reverseBits(int num) {
        String s = Integer.toBinaryString(num);
        String temp = "";
        if (s.length() < 32) {
            for (int i = 0; i < 32 - s.length(); i++) {
                temp += "0";
            }
        }
        s = temp + s;
        char[] c = s.toCharArray();
        int max = 0;
        int left = 0;
        int right = 0;
        int index = 0;
        boolean flag = false;
        while (left <= s.length() - 1 && right <= s.length() - 1) {
            if (c[right] == '0') {
                if (flag) {
                    max = Math.max(right - left, max);
                    left = index;
                    right = index;
                    flag = false;
                } else {
                    index = right + 1;
                    right++;
                    flag = true;
                }
            } else {
                right++;
            }
        }
        return Math.max(right - left , max);
    }
}
