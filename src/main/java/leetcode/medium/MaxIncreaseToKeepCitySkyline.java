//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
// 09.11.2022

package leetcode.medium;

import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args) {
        int[][] num = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(maxIncreaseKeepingSkyline(num));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int[] arrayX = new int[grid.length];
        int[] arrayY = new int[grid.length];
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
        if (grid[i][0] > num) num = grid[i][0];
        }
        System.out.println(Arrays.toString(arrayX));
        return result;
    }

}
