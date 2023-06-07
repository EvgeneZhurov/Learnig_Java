package leetcode.easy;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(536870912));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n > 1000000 && n % 2 == 0) {
            n /= 2048;
        }
        double krasota = Math.log(n) / Math.log(2);

        return krasota - (int) krasota == 0;
    }
}
