package JinDian;

public class ExchangeBits_39 {
    public static void main(String[] args) {
        int num = 2;
        exchangeBits(num);
    }

    public static int exchangeBits(int num) {
        String str = Integer.toBinaryString(num);
        if (str.length() % 2 != 0) {
            str = "0" + str;
        }
        char[] c = str.toCharArray();
        String result = "";
        for (int i = 0; i < str.length(); ) {
            result += c[i + 1];
            result += c[i];
            i += 2;
        }
        return Integer.parseInt(result, 2);
    }
}
