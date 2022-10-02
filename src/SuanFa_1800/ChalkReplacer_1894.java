package SuanFa_1800;

public class ChalkReplacer_1894 {
    public static void main(String[] args) {
        int[] chalk = new int[]{5, 1, 5};
        int k = 22;
        chalkReplacer(chalk, k);
    }

    public static int chalkReplacer(int[] chalk, int k) {
        while (k > 0) {
            for (int i = 0; i < chalk.length; i++) {
                k -= chalk[i];
                if (k < 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
