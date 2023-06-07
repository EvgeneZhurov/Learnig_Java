//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
// Начало 04.11.2022 в 23-56
package leetcode.easy;

import java.util.Set;
import java.util.TreeSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        int[] array = new int[]{-10,8,6,7,-2,-3};
        System.out.println(findMaxK(array));
    }

    public static int findMaxK(int[] nums) {
        short result = -1;
        Set<Integer> array = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (array.contains((-1) * nums[i]) && result < Math.abs(nums[i])) result = (short) Math.abs(nums[i]);
            array.add(nums[i]);
        }

        return result;
    }
}
