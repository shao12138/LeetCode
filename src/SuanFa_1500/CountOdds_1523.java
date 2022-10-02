package SuanFa_1500;

public class CountOdds_1523 {
    public static void main(String[] args) {
        int low = 8;
        int high = 10;
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        int left = low;
        int right = high;
        int result = 0;
        if (left % 2 != 0) {
            for (int i = left; i <= right; i += 2) {
                result++;
            }
        } else {
            for (int i = left + 1; i <= right; i += 2) {
                result++;
            }
        }
        return result;
    }
}
