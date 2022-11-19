package Leetcode;// Задача: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "ababcbbac";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int leight = 1;
        int num=s.charAt(0);
        System.out.println(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            Set<Character> alhabet = new HashSet<>();
            alhabet.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!alhabet.contains(s.charAt(j))) {
                    alhabet.add(s.charAt(j));
                    if (j == s.length() - 1) {
                        if (j - i >= leight) {
                            leight = j - i + 1;
                            return leight;
                        }
                    }
                } else {
                    if (j - i > leight) {
                        leight = j - i;
                    }
                    break;
                }
            }
        }

        return leight;
    }
}
