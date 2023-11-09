package leetcode.medium;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(getMinSum(grid));
    }

    public static int getMinSum(int[][] grid) {
        for (int i = 0; i < grid[0].length - 1; i++) {
            grid[0][i + 1] += grid[0][i];
        }

        for (int i = 0; i < grid.length - 1; i++) {
            grid[i + 1][0] += grid[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                grid[i][j + 1] += Math.min(grid[i][j], grid[i - 1][j + 1]);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}