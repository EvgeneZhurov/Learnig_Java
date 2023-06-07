package leetcode.medium;

import java.util.Set;
import java.util.TreeSet;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        int[] array = new int[]{1, 13, 10, 12, 31};

        System.out.println(countDistinctIntegers(array));
    }

    public static int countDistinctIntegers(int[] nums) {

        Set<Integer> result = new TreeSet<>();
        for (int num : nums) {
            result.add(num);

            result.add(reversNum(num));
        }

        return result.size();
    }

    public static int reversNum(int num) {

        while (num % 10 == 0) {
            num /= 10;
        }
        String str = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        String str1 = String.valueOf(result);
        return Integer.parseInt (str1.trim ());
    }
}
