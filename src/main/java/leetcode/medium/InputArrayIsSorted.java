package leetcode.medium;

import java.util.*;

public class InputArrayIsSorted {
    public static void main(String[] args) {

        int[] array = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int finish = numbers.length - 1;
        int[] result = new int[2];

        while (start < finish) {
            if (numbers[start] + numbers[finish] > target) {
                finish--;
            } else if (numbers[start] + numbers[finish] < target) {
                start++;
            } else {
                result[0] = start;
                result[1] = finish;
                return result;
            }
        }
        return result;

    }
}
