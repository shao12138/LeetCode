import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<int[]> enimies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            enimies.add(new int[]{x, y});
        }
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] enemy1 = enimies.get(i);
                int[] enemy2 = enimies.get(j);
                int dx = Math.abs(enemy1[0] - enemy2[0]);
                int dy = Math.abs(enemy1[1] - enemy2[1]);
                if (dx <= a && dy <= b) {
                    maxCount = Math.max(maxCount, j - i + 1);
                }
            }
        }
        System.out.println(maxCount);
    }
}
