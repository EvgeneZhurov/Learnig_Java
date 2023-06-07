package leetcode.medium;

import java.util.Arrays;

public class IntervalsBetweenIdenticalElements {
    public static void main(String[] args) {
        int[] list = new int[]{2, 1, 3, 1, 2, 3, 3};
        //System.out.println(Arrays.toString(getDistances(list)));


        int a = 5;
        int c = (int) (3*4*7/ Math.pow(a,2));
        System.out.println(c);

    }

    public static long[] getDistances(int[] arr) {

        long[] result = new long[arr.length];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] == arr[i]) {
                    result[j] += Math.abs(i - j);
                }
            }
        }
        return result;

    }
}
