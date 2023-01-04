package leetcode.medium;

public class LongestNiceSubarray {
    public static void main(String[] args) {

        int[] array = new int[]{744437702, 379056602, 145555074, 392756761, 560864007, 934981918, 113312475, 1090, 16384, 33, 217313281, 117883195, 978927664};
        System.out.println(longestNiceSubarray(array));
    }

    public static int longestNiceSubarray(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            result = Math.max(result, lengthOfOneElementFromArray(nums, i));
        }
        System.out.println(1090 & 117883195);
        return result;
    }

    public static int lengthOfOneElementFromArray(int[] nums, int i) {

        int result = 1;
        for (int j = i + 1; j < nums.length; j++) {
            if ((nums[i] & nums[j]) != 0) {
                return result;
            }
            result++;
        }
        return result;
    }
}
