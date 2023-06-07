package leetcode.easy;
// https://leetcode.com/problems/first-unique-character-in-a-string/


import java.util.List;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String text = "leetcode";
        System.out.println(firstUniqChar(text));
    }

    public static int firstUniqChar(String s) {
        if (s.length() < 2) {
            return -1;
        }
        List<String> alphabet = List.of("q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m");
        for (int i = 0; i < alphabet.size(); i++) {

            if (s.indexOf(alphabet.get(i)) != -1) {
            if (s.lastIndexOf(alphabet.get(i)) == (s.indexOf(alphabet.get(i)))) {
                return s.indexOf(alphabet.get(i));
            }
                continue;
            }
            if (i == alphabet.size() - 1) {
                return -1;
            }
        }
        return -1;

    }
}

