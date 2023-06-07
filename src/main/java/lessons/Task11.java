package lessons;//https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Task11 {
    public static void main(String[] args) {

        String a = "()[]{}";
        System.out.println(isCorrect(a));

    }

    public static boolean isCorrect(String s) {

        Stack<Character> array = new Stack<>();

        for (char element : s.toCharArray()) {
            System.out.println(element);
        }
        return false;

        /*
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
*/
    /*
        int index;
        while (s.length() > 0) {

            if ((index = s.indexOf("{}")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                continue;
            }
            if ((index = s.indexOf("[]")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                continue;
            }
            if ((index = s.indexOf("()")) != -1) {
                s = s.substring(0, index) + s.substring(index + 2);
                continue;
            }
            break;
        }
        if (s.length() == 0) {
            return true;
        }
        return false;

  /*


        String correctSymbols = "[]{}()";
        if (str.length() <= 0) {
            return false;
        } else {
            for (int i = 0; i < (str.length()); i++) {
                if (!correctSymbols.contains("" + str.charAt(i))) {
                    return false;
                }
            }
            List<String> str2 = new ArrayList<>();
            str2.add(str);
            while (true) {

                int index;
                if ((index = str.indexOf("{}")) != -1) {
                    str = str.substring(0, index) + str.substring(index + 2);
                }
                if (str.contains("[]")) {
                    str = str.substring(0, index) + str.substring(index + 2);
                }
                if (str.contains("()")) {
                    str = str.substring(0, index) + str.substring(index + 2);
                }
                if (str.length() == 0) {
                    return true;
                }
                if (str2.equals(str)) {
                    return false;
                }
                if (str.length() <= 1) return false;
            }
  */

    }

}




