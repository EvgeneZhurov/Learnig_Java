package leetcode.medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
   //     int[][] array = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(array);
    }

    public static void rotate(int[][] matrix) {

        int[] array = new int[matrix.length];

        for (int j = 0; j < matrix.length / 2; j++) {

            for (int i = j; i < matrix.length - j; i++) {
                array[i] = matrix[j][i];
                matrix[j][i] = matrix[matrix.length - i - 1][j];
            }
            for (int i = j; i < matrix.length - j; i++) {
                int num = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1-j] = array[i];
                array[i] = num;
            }
            for (int i = j; i < matrix.length - 1 - j; i++) {
                array[0] = matrix[matrix.length - 1 - j][matrix.length - 2 - i];
                matrix[matrix.length - 1-j][matrix.length - 2 - i] = array[i + 1];
                array[i + 1] = array[0];
            }
            for (int i = j; i < matrix.length - 2 - j; i++) {
                matrix[matrix.length - 2 - i][j] = array[i + 1];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
