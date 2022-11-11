package Offer;

public class Fib_10 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(45));
    }
    public static int fib(int n) {
        long a = 0;
        long b = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return (int) (result%1000000008);
    }
}
