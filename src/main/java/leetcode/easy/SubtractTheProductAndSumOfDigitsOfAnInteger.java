package leetcode.easy;

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {


        System.out.println(subtractProductAndSum(234));

    }

    public static int subtractProductAndSum(int n) {

        if (n < 10) {
            return 0;
        }
        int productOfDigits = 1;
        int sumOfDigits = 0;
        int num;
        while (n > 0) {
            num = n % 10;
            productOfDigits *= num;
            sumOfDigits += num;
            n /= 10;
        }

        return productOfDigits - sumOfDigits;
    }


}
