public class Main {
    public static void main(String[] args) {
        Long a = 100L;
        Long b = 100L;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        Long c = 1000L;
        Long d = 1000L;
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(new Long(0).equals(0));
    }
}