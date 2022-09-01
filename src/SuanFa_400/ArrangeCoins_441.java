package SuanFa_400;

public class ArrangeCoins_441 {
    public static void main(String[] args) {
        arrangeCoins(6);
    }

    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25)-0.5);
    }
}
