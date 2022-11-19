//https://leetcode.com/problems/sort-the-people/
// 0.5.11.2022 начало 10-00

package Leetcode;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = new String[]{"a", "b", "c", "d"};
        int[] heights = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] < heights[i + 1]) break;
            if (i == heights.length - 2) return names;
        }
        Map<Integer, String> result = new TreeMap<>();

        for (int i = 0; i < heights.length; i++) {
            result.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            names[i] = result.get(heights[heights.length - 1 - i]);
        }
        return names;
    }

}
