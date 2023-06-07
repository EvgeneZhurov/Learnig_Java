package leetcode.medium;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] array = new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(equalPairs(array));
    }


    public static int equalPairs(int[][] grid) {

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[0][i] != grid[j][i]){
                    break;
                }
            }
        }

        return -1;
    }
}
