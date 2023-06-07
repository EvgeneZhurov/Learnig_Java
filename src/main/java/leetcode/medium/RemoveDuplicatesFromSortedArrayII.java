package leetcode.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,1,2,2,2,2,3,3,4,5,5,5,5};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }
        int result = 1;
        int counter1 = 0;
        int aim = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (aim == nums[i]) {
                counter1++;
                if (counter1 < 2) {
                    nums[result]=nums[i];
                    result++;
                }
            } else {
                aim = nums[i];
                counter1 = 0;
                nums[result]=nums[i];
                result++;
            }
        }
        if (nums[nums.length - 2] == nums[nums.length - 1] && counter1 > 0) {
            return result;
        }
        nums[result] = nums[nums.length-1];
        return result + 1;
    }
}
