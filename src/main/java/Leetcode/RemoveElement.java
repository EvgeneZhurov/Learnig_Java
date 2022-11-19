package Leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = new int[]{1};
        int a = 2;
        System.out.println(removeElement(array, a));
    }

    public static int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        int k = 0;
        while (nums[k] != 101) {
            k++;
            if (k >= nums.length) break;
        }
        System.out.println(k);
        /*
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                break;
            }
            if (i == nums.length - 1) {
                return 0;
            }
        }

        int k = nums.length - 1;
        for (int i = 0; i <= k; i++) {
            while (nums[k] == val) {
                nums[k] = -1;
                k--;
            }
            if (nums[i] == val) {
                nums[i] = nums[k];
                nums[k] = -1;
                k--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
*/
        return k;

    }


}
