//https://leetcode.com/problems/matrix-diagonal-sum/
// начало 06.11.2022 сделал за 20 минут.

package leetcode.easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(array));
    }

    public static int diagonalSum(int[][] mat) {
        if (mat.length == 1) return mat[0][0];
        mat[0][0] = mat[0][0] + mat[0][mat.length - 1];
        for (int i = 1; i < mat.length; i++) {
            mat[0][0] = mat[0][0] + mat[i][i] + mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 != 0) {
            mat[0][0] = mat[0][0] - mat[(mat.length - 1) / 2][(mat.length - 1) / 2];
        }
        return mat[0][0];
    }
}
