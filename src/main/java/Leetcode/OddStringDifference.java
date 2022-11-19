//https://leetcode.com/problems/odd-string-difference/
//Начало 04.11.22 22-14
package Leetcode;

import javax.sound.midi.Soundbank;

public class OddStringDifference {
    public static void main(String[] args) {
        String[] array = new String[]{"adc","wzy","abc"};
        System.out.println(oddString(array));
    }


    public static String oddString(String[] words) {

        int[] array = new int[words[0].length() - 1];
        for (int i = 0; i < words[0].length() - 1; i++) {
            if (words[0].charAt(i + 1) - words[0].charAt(i) != words[1].charAt(i + 1) - words[1].charAt(i)) {
                for (int j = 0; j < words[0].length() - 1; j++) {
                    if (words[0].charAt(i + 1) - words[0].charAt(i) != words[2].charAt(i + 1) - words[2].charAt(i)) {
                        return words[0];
                    }
                }
                return words[1];
            }
            array[i] = words[0].charAt(i + 1) - words[0].charAt(i);
        }
        for (int i = 2; i < words.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != words[i].charAt(j + 1) - words[i].charAt(j)) {
                    return words[i];
                }
            }
        }
        return "1";
    }
}
