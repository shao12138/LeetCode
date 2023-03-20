import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] t = new String[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.next();
        }
        char[][] c = new char[n][m];
        char[][] d = new char[n][m];
        for (int i = 0; i < n; i++) {
            c[i] = t[i].toCharArray();
            d[i] = t[i].replaceAll("G", "B").toCharArray();
        }
        int a = countBlocks(c);
        int b = countBlocks(d);
        System.out.println(a - b);
    }

    public static int countBlocks(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }

    private static void bfs(char[][] grid, boolean[][] visited, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        visited[i][j] = true;
        char value = grid[i][j];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : directions) {
                int newRow = curr[0] + dir[0];
                int newCol = curr[1] + dir[1];
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !visited[newRow][newCol] && grid[newRow][newCol] == value) {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }
    }
}