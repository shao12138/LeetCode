package JinDian;

public class ConvertInteger_38 {
    public static void main(String[] args) {
        convertInteger(1, 2);
    }

    public static int convertInteger(int A, int B) {
        return Integer.bitCount(A^B);
    }
}
