package JinDian;

public class Multiply_45 {
    public int multiply(int A, int B) {
        int sum = 0;
        int min = Math.min(A, B);
        int max = Math.max(A, B);
        for (int i = 0; i < min; i++) {
            sum += max;
        }
        return sum;
    }
}
