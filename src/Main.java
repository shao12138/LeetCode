import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int count = 1;
        int row = 0, col = 0;
        boolean down = true, right = false;
        while (count <= n * n) {
            arr[row][col] = count;
            count++;
            if (down) {
                if (row == n - 1) {
                    right = true;
                    down = false;
                    col++;
                } else if (col == 0) {
                    down = true;
                    right = false;
                    row++;
                } else {
                    row++;
                    col--;
                }
            } else {
                if (col == n - 1) {
                    right = false;
                    down = true;
                    row++;
                } else if (row == 0) {
                    down = false;
                    right = true;
                    col++;
                } else {
                    row--;
                    col++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}