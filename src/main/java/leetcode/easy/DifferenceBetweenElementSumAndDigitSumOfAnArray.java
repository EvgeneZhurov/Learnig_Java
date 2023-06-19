package leetcode.easy;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static void main(String[] args) {

        int[] array = new int[]{1, 150, 6, 30};
        System.out.println(differenceOfSum(array));
    }

    public static int differenceOfSum(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                result += nums[i];

                while (nums[i] > 0) {
                    result -= nums[i] % 10;
                    nums[i] /= 10;
                }
            }
        }
        return result;
    }
}
