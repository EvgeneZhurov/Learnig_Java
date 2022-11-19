package Leetcode;

import java.util.Arrays;


public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int a = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] > nums[i]) {
                    a++;
                }
                result[j] = a;
            }
        }

        //Другое мое решение, тоже работает
        /*List<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            array.add(nums[i]);
        }
        array.sort(Comparator.naturalOrder());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array.indexOf(nums[i]);
        }*/
        return result;
    }
}
