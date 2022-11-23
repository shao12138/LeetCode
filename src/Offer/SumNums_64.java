package Offer;

public class SumNums_64 {
    public static void main(String[] args) {
        System.out.println(3<<2);
    }
    public int sumNums(int n) {
        return (int) ((Math.pow(n, 2) + n) / 2);
    }
}
