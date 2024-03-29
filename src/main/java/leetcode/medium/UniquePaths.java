package leetcode.medium;

public class UniquePaths {
    public static void main(String[] args) {

        System.out.println(uniquePaths(3, 7));

    }

    public static int uniquePaths(int m, int n) {

        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            result[0][i] = 1;
        }

        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                result[i][j] = result[i][j-1] + result[i - 1][j];
            }
        }

        return result[m - 1][n - 1];
    }
}
