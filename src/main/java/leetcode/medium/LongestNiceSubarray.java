package leetcode.medium;

public class LongestNiceSubarray {
    public static void main(String[] args) {

        int[] array = new int[]{800734140};
        System.out.println(longestNiceSubarray(array));
    }

    public static int longestNiceSubarray(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            result = Math.max(result, lengthOfOneElementFromArray(nums, i));
        }

        return result;
    }

    public static int lengthOfOneElementFromArray(int[] nums, int i) {

        int result = 1;
        for (int j = i + 1; j < nums.length; j++) {
            for (int k = i; k < j; k++) {

                if ((nums[k] & nums[j]) != 0) {
                    return result;
                }
            }
            result++;
        }
        return result;
    }
}
