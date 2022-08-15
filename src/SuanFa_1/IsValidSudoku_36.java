package SuanFa_1;

public class IsValidSudoku_36 {
    public static void main(String[] args) {
        char[][] c = new char[][]{
                {'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '5', '2', '.', '.'}
        };
        isValidSudoku(c);
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    for (int l = 0; l < 9; l++) {
                        if (board[i][l] == board[i][j] && l != j) {
                            return false;
                        }
                    }
                    for (int r = 0; r < 9; r++) {
                        if (board[r][j] == board[i][j] && i != r) {
                            return false;
                        }
                    }
                    int start1 = i / 3;
                    int start2 = j / 3;
                    for (int m = start1 * 3; m < start1 * 3 + 3; m++) {
                        for (int n = start2 * 3; n < start2 * 3 + 3; n++) {
                            if (board[m][n] == board[i][j] && m != i && n != j) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
