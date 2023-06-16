package leetcode.medium;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }


    public static int[][] generateMatrix(int n) {

        int array[][] = new int[n][n];
        int j = 0;
        int k = 0;
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < n * n; i++) {

            array[j][k] = i;

        }


        return array;
    }

}
