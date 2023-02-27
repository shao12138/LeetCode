package SuanFa_1700;

public class FindBall_1706 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1}};
        findBall(grid);
    }

    public static int[] findBall(int[][] grid) {
        int hight = grid.length;
        int weight = grid[0].length;
        int[] result = new int[weight];
        for (int i = 0; i < weight; i++) {
            result[i] = i;
        }

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < weight; j++) {
                if (result[j] != -1 && grid[i][result[j]] == 1) {
                    if (result[j] < weight - 1 && grid[i][result[j] + 1] == -1) {
                        result[j] = -1;
                    } else {
                        result[j] += 1;
                    }
                } else if (result[j] != -1 && grid[i][result[j]] == -1) {
                    if (result[j] > 0 && grid[i][result[j] - 1] == 1) {
                        result[j] = -1;
                        break;
                    } else {
                        result[j] -= 1;
                    }
                }
                if (result[j] == weight || result[j] < 0) {
                    result[j] = -1;
                    continue;
                }
            }
        }
        return result;
    }
}
