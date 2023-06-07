package Leetcode.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotate(array, 3)));
    }

    public static int[] rotate(int[] nums, int k) {

        if (nums.length % k != 0) {
            k = k % nums.length;
            int num2 = nums[0];
            int num3;
            for (int i = 0; i < nums.length; i++) {
                System.out.println((i + k + 1) % nums.length);
                nums[i] = nums[(i + k + 1) % nums.length];
                num3 = nums[(i + k) % nums.length];
                nums[(i + k) % nums.length] = num2;
                num2 = nums[(i + 1) % nums.length];
            }
        }

        return nums;
    }
}
