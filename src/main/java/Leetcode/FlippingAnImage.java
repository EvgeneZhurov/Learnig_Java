package Leetcode;//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] resalt = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        System.out.println(Arrays.deepToString(flipAndInvertImage(resalt)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];
        for (int j = 0; j < image.length; j++) {
            for (int i = 0; i < image.length; i++) {
                result[j][i] = (image[j][image.length - 1 - i]) ^ 1;
            }
        }
        return result;
    }
}
