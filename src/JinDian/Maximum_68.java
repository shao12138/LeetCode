package JinDian;

public class Maximum_68 {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -2147483648;
        maximum(a, b);
    }

    public static int maximum(int a, int b) {
        long x = (long) a;
        long y = (long) b;
        long temp = Math.abs(x - y);
        long max = (x + y + temp) / 2;
        return (int) max;
    }
}
