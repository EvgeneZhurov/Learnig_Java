// Задача: https://leetcode.com/problems/fizz-buzz/

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(fizzBuzz(a));

    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                result.add(String.valueOf(i));
                continue;
            }
            if (i % 5 != 0) {
                result.add("Fizz");
                continue;
            }
            if (i % 3 != 0) {
                result.add("Buzz");
                continue;
            }
            result.add("FizzBuzz");
        }
        System.out.println(result);
        return result;
    }
}
