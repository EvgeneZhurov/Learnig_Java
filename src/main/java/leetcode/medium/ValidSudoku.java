package leetcode.medium;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] array = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(array));
    }

    public static boolean isValidSudoku(char[][] board) {

        return isDoubleHorizontal(board) && isDoubleVertical(board) && isDoubleMatrix(board);
    }


    // The method checks for duplicates of by lines
    public static boolean isDoubleHorizontal(char[][] board) {

        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < 8; i++) {
                if (board[k][i] != '.') {
                    for (int j = i + 1; j < 9; j++) {
                        if (board[k][i] == board[k][j]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    // The method checks for duplicates by columns
    public static boolean isDoubleVertical(char[][] board) {

        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < 8; i++) {
                if (board[i][k] != '.') {
                    for (int j = i + 1; j < 9; j++) {
                        if (board[i][k] == board[j][k]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    // The method checks for duplicates in the 3 by 3 matrix
    public static boolean isDoubleMatrix(char[][] board) {

        int[] array = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int l = 0; l < 3; l++) {
            for (int k = 0; k < 3; k++) {

                for (int i = 0; i < 9; i++) {
                    array[i] = 1;
                }
                for (int j = 3 * k; j < 3 + 3 * k; j++) {
                    for (int i = 3 * l; i < 3 + 3*l; i++) {
                        if (board[i][j] != '.') {
                            array[Character.digit(board[i][j] - 1, 10)] -= 1;
                            if (array[Character.digit(board[i][j] - 1, 10)] < 0) {
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

  /*    ["8","3",".",".","7",".",".",".","."],
        ["6",".",".","1","9","5",".",".","."],
        [".","9","8",".",".",".",".","6","."],
        ["8",".",".",".","6",".",".",".","3"],
        ["4",".",".","8",".","3",".",".","1"],
        ["7",".",".",".","2",".",".",".","6"],
        [".","6",".",".",".",".","2","8","."],
        [".",".",".","4","1","9",".",".","5"]
        [".",".",".",".","8",".",".","7","9"]

   */