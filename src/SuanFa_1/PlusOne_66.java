package SuanFa_1;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] dig = new int[]{9, 9};
        plusOne(dig);
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i - 1] += 1;
                digits[i] = 0;
            }
        }
        if (digits[0] == 10) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;
            for (int i = 1; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
