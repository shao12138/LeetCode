package SuanFa_1;

public class Divide_29 {
    public static void main(String[] args) {
        int a = -1010369383;
        int b = -2147483648;
        System.out.println(divide(a, b));
    }

    public static int divide(int dividend, int divisor) {
        int result = 0;
        int a = dividend;
        int b = divisor;
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        } else if (a == Integer.MIN_VALUE && b == 1) {
            return Integer.MIN_VALUE;
        } else if (a == Integer.MAX_VALUE && b == 1) {
            return Integer.MAX_VALUE;
        } else if (a == Integer.MAX_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        if (b == Integer.MIN_VALUE) {
            if (a == Integer.MIN_VALUE) {
                return 1;
            } else {
                return 0;
            }
        } else if (b == Integer.MAX_VALUE) {
            if (a == Integer.MAX_VALUE) {
                return 1;
            } else if (a == Integer.MIN_VALUE || a == Integer.MIN_VALUE + 1) {
                return -1;
            } else {
                return 0;
            }
        }
        if (a % b == 0) {
            result = 1;
        }
        if (a == Integer.MIN_VALUE) {
            if (b > 0) {
                b = -b;
                while (b > a) {
                    result++;
                    b -= divisor;
                    if (b > 0) {
                        break;
                    }
                }
                return (int) -result;
            } else {
                while (b > a) {
                    result++;
                    b += divisor;
                    if (b > 0) {
                        break;
                    }
                }
                return (int) result;
            }
        }
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            a = Math.abs(a);
            b = Math.abs(b);
            divisor = (int) b;
            if (a == b) {
                return -1;
            }
            if (b > a) {
                return 0;
            }
            while (b < a) {
                result++;
                b += divisor;
                if (b < 0) {
                    break;
                }
            }
            return (int) -result;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            divisor = (int) b;
            if (a == b) {
                return 1;
            }
            if (b > a) {
                return 0;
            }
            while (b < a) {
                result++;
                b += divisor;
                if (b < 0) {
                    break;
                }
            }
            return (int) result;
        }
    }
}
