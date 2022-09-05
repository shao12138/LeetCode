package SuanFa_600;

public class JudgeSquareSum_633 {
    public static void main(String[] args) {
        judgeSquareSum(2147483600);
    }

    public static boolean judgeSquareSum(int c) {
        if (c == 1 || c == 2) {
            return true;
        }
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int left2 = left * left;
            int right2 = right * right;
            int left3 = c-right2;
            if (left2 < left3) {
                left++;
            } else if (left2 > left3) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
