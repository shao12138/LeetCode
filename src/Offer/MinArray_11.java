package Offer;

public class MinArray_11 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 3};
        minArray(numbers);
    }

    public static int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }
}
