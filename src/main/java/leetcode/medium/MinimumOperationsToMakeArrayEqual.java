package leetcode.medium;

public class MinimumOperationsToMakeArrayEqual {
    public static void main(String[] args) {
        System.out.println(minOperations(7));
    }

    public static int minOperations(int n) {

        if (n % 2 != 0) {
            return (4 + 2 * ((n / 2) - 1)) * (n / 2) / 2;
        }

        return n * n / 4;
    }
}
