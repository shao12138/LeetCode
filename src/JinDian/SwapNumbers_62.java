package JinDian;

public class SwapNumbers_62 {
    public int[] swapNumbers(int[] numbers) {
        numbers[1] = numbers[0] + numbers[1];
        numbers[0] = numbers[1] - numbers[0];
        numbers[1] = numbers[1] - numbers[0];
        return numbers;
    }
}
