package leetcode.medium;

import java.util.*;

public class InputArrayIsSorted {
    public static void main(String[] args) {

        int[] array = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        Set<Integer> collection = new LinkedHashSet<>();

        for (int v : numbers) {
            collection.add(v);
        }

        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (collection.contains(target - numbers[i])) {
                result[0] = i;
                for (int j = numbers.length - 1; j > i; j--) {
                    if (numbers[j] == target - numbers[i]) {
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;

    }
}
