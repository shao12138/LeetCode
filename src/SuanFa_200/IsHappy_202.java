package SuanFa_200;

public class IsHappy_202 {
    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {
        for (int i = 0; i < 30; i++) {
            int temp = 0;
            while (n > 0) {
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            if (temp == 1) {
                return true;
            } else {
                n = temp;
            }
        }
        return false;
    }
}
