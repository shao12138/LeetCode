package JinDian;

public class DrawLine_40 {
    public static void main(String[] args) {
        int length = 45;
        int w = 160;
        int x1 = 32;
        int x2 = 159;
        int y = 8;
        drawLine(length, w, x1, x2, y);
    }

    public static int[] drawLine(int length, int w, int x1, int x2, int y) {
        int[] results = new int[length];
        int[] nums = new int[w];
        for (int i = x1; i <= x2; i++) {
            nums[i] = 1;
        }
        int row = (w / 32) * y;
        for (int i = row; i < row + w / 32 && i < length; i++) {
            String temp = "0";
            for (int j = (i - row) * 32; j < (i - row + 1) * 32 && j < w; j++) {
                temp += nums[j];
            }
            results[i] = (int) Long.parseLong(temp, 2);
        }
        return results;
    }
}
