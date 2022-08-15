package SuanFa_1;

public class MySqrt_69 {
    public static void main(String[] args) {
        mySqrt(6);
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left < right) {
            int middle = (left + right) / 2;
            if (middle * middle == x) {
                return middle;
            } else if (middle * middle < x && (middle + 1) * (middle + 1) > x) {
                return middle;
            } else if (middle * middle > x && (middle - 1) * (middle - 1) < x) {
                return middle - 1;
            } else if (middle > x) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return 0;
    }
}
