package leetcode.easy;



public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] array = new int[]{2, 54, 73, 52, 33, 47, 73, 54, 23, 82, 98, 13, 51, 52, 1, 96, 69, 76};
        System.out.println(numIdenticalPairs(array));
    }

    public static int numIdenticalPairs(int[] nums) {

        int[] array = new int[101];
        for (int num : nums) {
            array[num]++;
        }
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                result = result + (array[i] * (array[i] - 1) / 2);
            }
        }

        return result;
    }
}
