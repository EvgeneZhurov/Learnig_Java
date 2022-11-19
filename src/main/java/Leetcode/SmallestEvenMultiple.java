package Leetcode;//https://leetcode.com/problems/smallest-even-multiple/description/
// заняло времени 5 минут.

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(smallestEvenMultiple(a));
    }

    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        return 2 * n;
    }
}
