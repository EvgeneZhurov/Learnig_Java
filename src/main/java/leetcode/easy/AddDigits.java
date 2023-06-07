package leetcode.easy;

// Задача https://leetcode.com/problems/add-digits/submissions/828152244/
public class AddDigits {
    public static void main(String[] args) {
        int num = 3891;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int result;
        int n = 1;
        while (Math.pow(10, n) <= num) {
            n++;
        }
        do {
            result = 0;
            for (int i = 1; i <= n; i++) {
                int b = num - (num / 10) * 10;
                num = num / 10;
                result = result + b;
            }
            num = result;
        } while (result > 9);
        return result;
    }
}
