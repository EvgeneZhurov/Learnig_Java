package leetcode.easy;// https://leetcode.com/problems/longest-common-prefix/

// "ЭТО САМАЯ КОНЕЧННАЯ ЗАДАЧА, КОТОРУЮ Я ВСТРЕЧАЛ

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
