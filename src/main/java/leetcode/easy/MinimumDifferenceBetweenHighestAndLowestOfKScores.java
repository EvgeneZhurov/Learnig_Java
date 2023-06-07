package leetcode.easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        int[] nums = new int[]{9};
        System.out.println(minimumDifference(nums, 1));
    }

    public static int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int result = nums[k-1] - nums[0];
        for (int i = 1; i < nums.length - k+1; i++) {
            result = Math.min(result, nums[i+k-1] - nums[i]);
        }
        return result;
    }
}
