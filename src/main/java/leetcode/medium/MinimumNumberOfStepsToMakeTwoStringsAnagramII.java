package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramII {
    public static void main(String[] args) {

        String a = "leetcode";
        String b = "coats";
        System.out.println(minSteps(a, b));
    }

    public static int minSteps(String s, String t) {


        int[] array = new int[26];


        Map<Character, Integer> mapa = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapa.get(s.charAt(i)) == null) {
                mapa.put(s.charAt(i), 1);
            } else {
                mapa.put(s.charAt(i), mapa.get(s.charAt(i)) + 1);
            }
        }
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            if (mapa.get(t.charAt(i)) == null) {
                result++;
            } else {
                mapa.put(t.charAt(i), mapa.get(t.charAt(i)) - 1);
                if (mapa.get(t.charAt(i)) < 0) {
                    result++;
                }
            }
        }
        mapa.clear();
        for (int i = 0; i < t.length(); i++) {
            if (mapa.get(t.charAt(i)) == null) {
                mapa.put(t.charAt(i), 1);
            } else {
                mapa.put(t.charAt(i), mapa.get(t.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (mapa.get(s.charAt(i)) == null) {
                result++;
            } else {
                mapa.put(s.charAt(i), mapa.get(s.charAt(i)) - 1);
                if (mapa.get(s.charAt(i)) < 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
