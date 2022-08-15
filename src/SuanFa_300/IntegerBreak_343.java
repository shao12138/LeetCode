package SuanFa_300;

public class IntegerBreak_343 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(integerBreak(a));
    }

    public static int integerBreak(int n) {
        int result = 1;
        int i = n;
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        }
        for (; i > 3; i -= 3) {
            result *= 3;
            if (i == 7) {
                i -= 3;
                break;
            }
        }
        result *= i;
        return result;
    }
}
