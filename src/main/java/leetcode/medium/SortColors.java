package leetcode.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {

        int[] array = new int[]{2, 0, 1, 2, 0, 1};
        sortColors(array);
    }

    public static void sortColors(int[] nums) {

        boolean res = true;
        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                res = false;
            }
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 2) {
                two++;
            }
        }
        if (!res) {

            if (nums[nums.length - 1] == 1) {
                one++;
            } else if (nums[nums.length - 1] == 2) {
                two++;
            }

            for (int i = 0; i < nums.length - one - two; i++) {
                nums[i] = 0;
            }
            for (int i = nums.length - one - two; i < nums.length - two; i++) {
                nums[i] = 1;
            }
            for (int i = nums.length - two; i < nums.length; i++) {
                nums[i] = 2;
            }
        }
    }
}
