package leetcode.easy;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {

        int[] array = new int[]{9, 4};
        System.out.println(findGCD(array));
    }

    public static int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int result = 1;

        for (int i = 1; i <= Math.sqrt(min) + 1; i++) {
            if (min % i == 0) {
                if (max % (min / i) == 0) {
                    return min / i;
                }
                if (result < i && max % i == 0) {
                    result = i;
                }
            }
        }

        return result;
    }
}
