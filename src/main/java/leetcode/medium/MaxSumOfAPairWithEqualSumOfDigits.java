package leetcode.medium;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static void main(String[] args) {

        int[] array = new int[]{10,12,19,14};
        System.out.println(maximumSum(array));
    }

    public static int maximumSum(int[] nums) {


        Map<Integer, Integer> map = new TreeMap<>();
        int result = -1;
        for (int num : nums) {
            int value = sumOfDigitsOfTheNumber(num);
            if (map.get(value) == null) {
                map.put(value, num);
            } else {
                result = Math.max(result, map.get(value) + num);
                map.put(value,Math.max(map.get(value), num));
            }
        }

        return result;
    }

    public static int sumOfDigitsOfTheNumber(int num) {

        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }
}
