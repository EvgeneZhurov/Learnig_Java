package leetcode.easy;


public class SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        System.out.println(numSpecial(array));
    }

    public static int numSpecial(int[][] mat) {

        int[] row = new int[mat.length];
        int[] column = new int[mat[0].length];

        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] == 1) {
                    row[j]++;
                    column[i]++;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] == 1 && column[j] == 1 && mat[i][j] == 1) {
                    result++;
                }
            }
        }

        return result;
    }
}
