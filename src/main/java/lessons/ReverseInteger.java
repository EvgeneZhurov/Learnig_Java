package lessons;//https://leetcode.com/problems/reverse-integer/

import javax.sound.midi.Soundbank;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }
        while (x - (x / 10) * 10 == 0) {
            x = x / 10;
        }
        if (x == -2147483648) {
            return 0;
        }
        x = x * sign;
        long y = x;
        int n = 1;
        while (y > 9) {
            n++;
            y = y / 10;
        }
        n--;
        y = 0;
        for (int i = 0; i <= n; i++) {
            int m = (int) (x / (Math.pow(10, n - i)));
            y = (long) (y + m * Math.pow(10, i));
            x = (int) (x - m * Math.pow(10, n - i));
        }
        if (y >= Integer.MAX_VALUE) {
            return 0;
        }
        if ((-1) * y < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) (sign * y);
    }
}
