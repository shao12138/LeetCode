public class Test {
    public static void main(String[] args) {
        int k = 10;
        k = k + (k++) + (++k);
        System.out.print(k);
    }
}