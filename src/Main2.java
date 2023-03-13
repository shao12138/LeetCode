import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] day = new int[n];
        for (int i = 0; i < n; i++) {
            day[i] = in.nextInt();
        }
        int[] mean = new int[n];
        double sum = 0.0;
        int[] middle = new int[n];
        for (int i = 0; i < n; i++) {
            sum += day[i];
            double f = i + 1.0;
            mean[i] = (int) Math.ceil(sum / f);
            if (i % 2 == 0) {
                middle[i] = day[(i) / 2];
            } else {
                middle[i] = (int) Math.ceil((day[i / 2] + day[i / 2 + 1]) / 2.0);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(mean[i]);
            } else {
                System.out.print(mean[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(middle[i]);
            } else {
                System.out.print(middle[i] + " ");
            }
        }
        System.out.println();
    }
}
