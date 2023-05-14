package JinDian;

public class Tictactoe_65 {
    public static void main(String[] args) {
        String[] a = new String[]{"O X"," XO","X O"};
        System.out.println(tictactoe(a));
    }

    public static String tictactoe(String[] board) {
        int length = board.length;
        String X = "";
        String O = "";
        for (int i = 0; i < length; i++) {
            X += "X";
            O += "O";
        }
        for (int i = 0; i < length; i++) {
            if (board[i].equals(O)) {
                return "O";
            } else if (board[i].equals(X)) {
                return "X";
            }
        }
        for (int i = 0; i < length; i++) {
            String temp = "";
            for (int j = 0; j < length; j++) {
                temp += board[j].charAt(i);
            }
            if (temp.equals(O)) {
                return "O";
            } else if (temp.equals(X)) {
                return "X";
            }
        }
        String temp1 = "";
        String temp2 = "";
        for (int i = 0; i < length; i++) {
            temp1 += board[i].charAt(i);
            temp2 += board[length - i - 1].charAt(i);
        }
        if (temp1.equals(O) || temp2.equals(O)) {
            return "O";
        } else if (temp1.equals(X) || temp2.equals(X)) {
            return "X";
        }

        for (int i = 0; i < length; i++) {
            if (board[i].trim().length() != length) {
                return "Pending";
            }
        }

        for (int i = 0; i < length; i++) {
            String temp = "";
            for (int j = 0; j < length; j++) {
                temp += board[i].charAt(j);
            }
            if (temp.trim().length() != length) {
                return "Pending";
            }
        }

        return "Draw";
    }
}
