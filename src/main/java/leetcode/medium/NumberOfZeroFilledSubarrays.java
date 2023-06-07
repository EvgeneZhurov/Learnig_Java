package leetcode.medium;

public class NumberOfZeroFilledSubarrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 0, 0, 2, 0, 0, 4};
        System.out.println(zeroFilledSubarray(array));
    }

    public static long zeroFilledSubarray(int[] nums) {

        long result = 0;
        long num = 0;
        for (int j : nums) {
            if (j == 0) {
                num++;
            } else {
                if (num != 0) {
                    result += num * (num + 1) / 2;
                }
                num = 0;
            }
        }
        if (num != 0) {
            result += num * (num + 1) / 2;
        }

        return result;
    }
}
