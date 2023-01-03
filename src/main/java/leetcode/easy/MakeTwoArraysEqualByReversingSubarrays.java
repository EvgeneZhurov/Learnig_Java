package leetcode.easy;

import java.util.*;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void main(String[] args) {

        int[] target = new int[]{1, 1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 5};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Integer> compare1 = new HashMap<>();
        Map<Integer, Integer> compare2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (compare1.get(arr[i]) != null) {
                compare1.put(arr[i], compare1.get(arr[i]) + 1);
            } else {
                compare1.put(arr[i], 1);
            }
            if (compare2.get(target[i]) != null) {
                compare2.put(target[i], compare2.get(target[i]) + 1);
            } else {
                compare2.put(target[i], 1);
            }
        }

        return compare1.equals(compare2);
    }
}
