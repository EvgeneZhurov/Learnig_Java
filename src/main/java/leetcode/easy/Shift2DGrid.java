package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        int[][] array = new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        System.out.println(shiftGrid(array, 16));

    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> array = new ArrayList<>();
        if (k % (grid[0].length * grid.length) == 0) {

            for (int[] ints : grid) {
                for (int j = 0; j < grid[0].length; j++) {
                    array.add(ints[j]);
                }
                result.add(List.copyOf(array));

                array.clear();
            }

            return result;
        }
        /*else {
            k = k % grid[0].length;
        }*/

        return result;
    }
}
