package SuanFa_1200;

public class SubtractProductAndSum_1281 {
    public static void main(String[] args) {
        int n = 705;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        if (n == 100000) {
            return n;
        }
        int length = (n + "").length();
        int num[] = new int[5];
        for (int i = 1; i <= 5; i++) {
            num[i - 1] = (int) ((n % Math.pow(10, i)) / Math.pow(10, i - 1));
        }
        int a = 1;
        int b = 0;
        for (int i = 0; i < 5; i++) {
            if (i < length) {
                a *= num[i];
            }
            b += num[i];
        }
        return a - b;
    }
}
