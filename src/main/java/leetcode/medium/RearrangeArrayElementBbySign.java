package leetcode.medium;

import java.util.Arrays;

public class RearrangeArrayElementBbySign {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(array)));
    }

    public static int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];
        int plus = 0;
        int minus = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[plus] = nums[i];
                plus += 2;
            } else {
                result[minus] = nums[i];
                minus+=2;
            }
        }
        return result;
   /*     int[] minus = new int[nums.length / 2];
        int[] plus = new int[nums.length / 2];
        int j = 0;
        int k = 0;

        for (int num : nums) {
            if (num > 0) {
                plus[j] = num;
                j++;
            } else {
                minus[k] = num;
                k++;
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            nums[2*i] = plus[i];
            nums[2*i+1] = minus[i];
        }

        return nums;
    */
    }
}
