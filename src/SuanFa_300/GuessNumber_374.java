package SuanFa_300;

public class GuessNumber_374 {
    static int key = 1702766719;

    public static void main(String[] args) {
        guessNumber(2126753390);
    }

    public static int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (true) {
            int middle = right - (right - left) / 2;
            int temp = guess(middle);
            if (temp == 1) {
                left = middle + 1;
            } else if (temp == -1) {
                right = middle;
            } else if (temp == 0) {
                return middle;
            }
        }
    }

    public static int guess(int num) {
        if (num > key) {
            return -1;
        } else if (num == key) {
            return 0;
        } else {
            return 1;
        }
    }
}
