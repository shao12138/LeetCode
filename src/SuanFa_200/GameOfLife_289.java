package SuanFa_200;

import java.util.ArrayList;

public class GameOfLife_289 {
    int[] dx = new int[]{1, 1, -1, -1, 0, 0, 1, -1};
    int[] dy = new int[]{1, -1, 1, -1, 1, -1, 0, 0};

    public void gameOfLife(int[][] board) {
        int heigh = board.length;
        int width = board[0].length;
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) {
                int alive = 0;
                for (int k = 0; k < dx.length; k++) {
                    int newX = i + dx[k];
                    int newY = j + dy[k];
                    if (newX >= 0 && newX < heigh && newY >= 0 && newY < width && board[newX][newY] == 1) {
                        alive++;
                    }
                }
                if (alive < 2 && board[i][j] == 1) {
                    //细胞死亡
                } else if ((alive == 2 || alive == 3) && board[i][j] == 1) {
                    arrayList.add(new Integer[]{i, j});
                } else if (alive > 3 && board[i][j] == 1) {
                    //细胞死亡
                } else if (alive == 3 && board[i][j] == 0) {
                    arrayList.add(new Integer[]{i, j});
                }
            }
        }
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = 0;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Integer[] temp = arrayList.get(i);
            board[temp[0]][temp[1]] = 1;
        }
    }
}
