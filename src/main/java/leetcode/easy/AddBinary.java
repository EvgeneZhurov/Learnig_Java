package leetcode.easy;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a = String.valueOf(11001);
        String b = String.valueOf(100);

        System.out.println(AddBinary(a, b));
    }

    public static String AddBinary(String a, String b) {

        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        return num1.add(num2).toString(2);
    }
}
