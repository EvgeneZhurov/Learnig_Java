package leetcode.medium;

public class MaximumSumOfAnHourglass {
    public static void main(String[] args) {
        int[][] array = new int[][]{{6, 2, 1, 100}, {4, 2, 1, 5}, {9, 2, 8, 7}, {4, 1, 2, 9}};
        System.out.println(maxSum(array));
    }

    public static int maxSum(int[][] grid) {
        int result = 0;
        for (int j = 0; j < grid.length - 2; j++) {

            for (int i = 0; i < grid[0].length - 2; i++) {
                int num =grid[j][i] + grid[j][i + 1] + grid[j][i + 2] + grid[j + 1][i + 1] + grid[j + 2][i] + grid[j + 2][i + 1] + grid[j + 2][i + 2];
                if (result < num) {
                    result = num;
                }
            }
        }
        return result;
    }

}
