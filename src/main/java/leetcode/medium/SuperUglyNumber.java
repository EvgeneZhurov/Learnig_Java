package leetcode.medium;

public class SuperUglyNumber {
    public static void main(String[] args) {

        int[] array = new int[]{2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(12, array));

    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        if (n == 1) {
            return 1;
        }
        int result = 1;
        int i = primes[0];
        int k = 1;
        while (k < n) {
            if (isUglyNumber(i, primes)) {
                result = i;
                k++;
            }
            i++;
        }

        return result;
    }

    public static boolean isUglyNumber(int i, int[] primes) {
        if (i % 2 == 0 && primes[0] != 2) {
            return false;
        }

        for (int prime : primes) {
            while (i % prime == 0) {
                i /= prime;
            }
            if (i == 1) {
                return true;
            }
            if (i < prime) {
                return false;
            }

        }
        return i == 1;
    }
}
