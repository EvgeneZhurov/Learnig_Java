package Leetcode;

import java.util.Set;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"a", "bdc"};
        boolean arrayStringsAreEqual;
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1= "";
        String str2= "";

        for (int i = 0; i < word1.length; i++) {
            str1 = str1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 = str2 + word2[i];
        }

        System.out.println(str1);
        System.out.println(str2);

        if (str1.equals(str2)) {
            return true;
        }

        return false;
    }
}
