package SuanFa_1;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder_54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList();
        int maxNum = matrix.length * matrix[0].length;
        int curNum = 1;
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上
        int directionIndex = 0;
        while (curNum <= maxNum) {
            result.add(matrix[row][column]);
            matrix[row][column] = 0;
            curNum++;
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= matrix.length || nextColumn < 0 || nextColumn >= matrix[0].length || matrix[nextRow][nextColumn] == 0) {
                directionIndex = (directionIndex + 1) % 4; // 顺时针旋转至下一个方向
            }
            row = row + directions[directionIndex][0];
            column = column + directions[directionIndex][1];
        }
        return result;
    }
}
