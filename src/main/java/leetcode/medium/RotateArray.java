package leetcode.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotate(array, 5)));
    }

    public static int[] rotate(int[] nums, int k) {

        int[] result = new int[nums.length];

        if (k % nums.length != 0) {
            k = k % nums.length;
            for (int i = 0; i < nums.length; i++) {
                result[(i + k) % nums.length] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = result[i];
            }
        }
        return result;
    }
}
