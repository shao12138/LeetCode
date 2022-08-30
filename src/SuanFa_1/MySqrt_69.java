package SuanFa_1;

public class MySqrt_69 {
    public static void main(String[] args) {
        mySqrt(8);
    }

    public static int mySqrt(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        int left = 1;
        int right = num;
        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            int temp = num / middle;
            if (temp > middle) {
                left = middle + 1;
            } else if (temp < middle) {
                right = middle - 1;
            } else if (temp == middle) {
                return middle;
            }
        }
        return right;
    }
}
