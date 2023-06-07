package leetcode.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = new int[]{9, 6, 4, 2, 3, 7, 0, 1, 8};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] nums) {

        int totalsum = nums.length * (nums.length + 1) / 2;
        for (int i : nums)
            totalsum -= i;
        return totalsum;

    }
}
