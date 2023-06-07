package leetcode.easy;

import java.util.*;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void main(String[] args) {

        int[] target = new int[]{1, 1, 2, 3, 4};
        int[] arr = new int[]{2, 4, 1, 5};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {

        Map<Integer, Integer> compare = new HashMap<>();

        for (int value : arr) {
            if (compare.get(value) != null) {
                compare.put(value, compare.get(value) + 1);
            } else {
                compare.put(value, 1);
            }
        }

        for (int k : target) {
            if (compare.get(k) != null) {
                compare.put(k, compare.get(k) - 1);
            } else {
                System.out.println(compare);
                return false;
            }
        }
        System.out.println(compare);
        for(
    int j :target) {
        if (compare.get(j) != 0) {
            return false;
        }
    }
        return true;
}
}
