package leetcode.easy;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {

        int result = 1;
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                result += (num % i) + i;
            }
        }
        if (result == num) {
            return true;
        }
        return false;
    }

}
