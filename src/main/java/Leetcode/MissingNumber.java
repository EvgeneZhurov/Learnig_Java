package Leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = new int[]{9, 6, 4, 2, 3, 7, 0, 1, 8};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        if (result == (nums.length - 1) * nums.length / 2) {
            return nums.length;
        }
        return ((nums.length + 1) * nums.length / 2) - result;

    }
}
