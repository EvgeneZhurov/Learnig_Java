package leetcode.Medium;

import java.util.Arrays;

public class ClosestPointsToOrigin {
    public static void main(String[] args) {

        int[][] array = new int[][]{{3,3},{5,-1},{-2,4}};
        System.out.println(Arrays.deepToString(kClosest(array, 2)));
    }

    public static int[][] kClosest(int[][] points, int k) {

        int[] pow = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            pow[i] = (int) (Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
        }
        System.out.println(Arrays.toString(pow));
        if (points.length > k * 10) {
            for (int i = 0; i < k; i++) {
                for (int j = points.length - 1; j > 0; j--) {
                    if (pow[j] < pow[j - 1]) {
                        pow[j] += pow[j - 1];
                        pow[j - 1] = pow[j] - pow[j - 1];
                        pow[j] -= pow[j - 1];
                    }
                }
            }
        } else {
            Arrays.sort(pow);
        }
        System.out.println(Arrays.toString(pow));
        int res = pow[k - 1];

        int[][] result =new int[k][2];
        int check = 0;
        for (int[] point : points) {
            if ((Math.pow(point[0], 2) + Math.pow(point[1], 2)) <= res) {
                result[check][0] = point[0];
                result[check][1] = point[1];
                if (check == k - 1) {
                    break;
                }
                check++;
            }
        }

        return result;
    }
}
