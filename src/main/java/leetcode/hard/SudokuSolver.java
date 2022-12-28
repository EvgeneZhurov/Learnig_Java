package leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class SudokuSolver {
    public static void main(String[] args) {

        //       char[][] board = new char[][]{{'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '3', '6', '.', '.', '.', '.', '.'}, {'.', '7', '.', '.', '9', '.', '2', '.', '.'}, {'.', '5', '.', '.', '.', '7', '.', '.', '.'}, {'.', '.', '.', '.', '4', '5', '7', '.', '.'}, {'.', '.', '.', '1', '.', '.', '.', '3', '.'}, {'.', '.', '1', '.', '.', '.', '.', '6', '8'}, {'.', '.', '8', '5', '.', '.', '.', '1', '.'}, {'.', '9', '.', '.', '.', '.', '4', '.', '.'}};

        char[][] board = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '5', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(board[i][j]);
            }
        }

        //CСоздаем новую матрицу с значениями int
        int[][] array = new int[9][9];
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[j][i] - '0' > 0) {
                    array[j][i] = board[j][i] - '0';
                }
            }
        }
        printMatrix(array);
        System.out.println();

        while (searchElementByGrid(array)[0] != -1) {

            boolean isTrue = true;
            while (isTrue) {
                isTrue = false;

                //Посик индекса с нулевым элементом и проверка элемента на методы isContainsElement и содержания матрицы 3 на 3
                for (int j = 0; j < 9; j++) {
                    for (int i = 0; i < 9; i++) {
                        if (array[i][j] == 0) {
                            if (isContainsElement(i, j, array) != -1) {
                                array[i][j] = isContainsElement(i, j, array);
                                isTrue = true;
                            }
                            if (array[i][j] == 0 && matrixThreeOnThree(i, j, array) != -1) {
                                array[i][j] = matrixThreeOnThree(i, j, array);
                                isTrue = true;
                            }
                        }
                    }
                }
            }


            if (searchElementByGrid(array)[0] != -1) {
                array[searchElementByGrid(array)[1]][searchElementByGrid(array)[2]] = searchElementByGrid(array)[0];
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = (char) (array[i][j] + '0');
            }
        }

    }


    public static int[] searchElementByGrid(int[][] array) {

        int[][] array1 = new int[9][9];
        int[] result = new int[]{-1, -1, -1};

        for (int i = 1; i < 10; i++) {

            for (int a = 0; a < 9; a++) {
                for (int b = 0; b < 9; b++) {
                    array1[a][b] = array[a][b];
                }
            }

            for (int l = 0; l < 9; l++) {
                for (int j = 0; j < 9; j++) {
                    if (array1[j][l] == i) {
                        for (int k = 0; k < 9; k++) {
                            if (array1[k][l] == 0) {
                                array1[k][l] = -1;
                            }
                            if (array1[j][k] == 0) {
                                array1[j][k] = -1;
                            }
                        }
                    }
                }
            }
            //нужно закрыть оставшиеся поля -1, если число есть в наличии


            // нужно создать проврку на наличие только одного нуля в каждой матрице 3 на 3!!!
            for (int q = 0; q < 9; q += 3) {

                for (int j = 0; j < 3; j++) {
                    int m = -1;
                    int n = -1;
                    boolean istrue = true;
                    for (int t = 0; t < 3; t++) {
                        for (int k = j * 3; k < 3 * j + 3; k++) {
                            if (array1[k][t + q] == i || array1[k][t + q] == 0 && m != -1) {
                                istrue = false;
                                break;
                            }
                            if (array1[k][t + q] == 0 && m == -1) {
                                m = k;
                                n = t + q;
                            }
                        }
                    }
                    if (!istrue) {
                        continue;
                    }
                    result[0] = i;
                    result[1] = m;
                    result[2] = n;

                    return result;

                }
            }
        }
        return result;
    }

    // Метод ищет свободный элемент в матрице 3 на 3.
    public static int matrixThreeOnThree(int i, int j, int[][] array) {

        List<Integer> nums = new ArrayList<>();
        for (int k = 1; k < 10; k++) {
            nums.add(k);
        }

        int x = (i / 3) * 3;
        int y = (j / 3) * 3;
        for (int s = y; s < y + 3; s++) {
            for (int k = x; k < x + 3; k++) {
                for (int l = 0; l < nums.size(); l++) {
                    if (array[k][s] == nums.get(l)) {
                        nums.remove(l);
                    }
                }
            }
        }

        if (nums.size() == 1) {
            return nums.get(0);
        }
        return -1;
    }

    //МЕТОД РАБОТАЕТ БЕЗ ОШИБОК!
    public static int isContainsElement(int i, int j, int[][] array) {

        List<Integer> nums = new ArrayList<>();
        for (int k = 1; k < 10; k++) {
            nums.add(k);
        }

        for (int k = 0; k < 9; k++) {
            if (array[i][k] != 0) {
                for (int l = 0; l < nums.size(); l++) {
                    if (array[i][k] == nums.get(l)) {
                        nums.remove(l);
                    }
                }
            }
            if (array[k][j] != 0) {
                for (int l = 0; l < nums.size(); l++) {
                    if (array[k][j] == nums.get(l)) {
                        nums.remove(l);
                    }
                }
            }
        }
        if (nums.size() == 1) {
            return nums.get(0);
        }
        return -1;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}