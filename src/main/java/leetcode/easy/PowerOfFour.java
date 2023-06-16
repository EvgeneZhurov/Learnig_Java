package leetcode.easy;

public class PowerOfFour {
    public static void main(String[] args) {





        System.out.println(isPowerOfFour(64));

    }


    public static boolean isPowerOfFour(int n) {

        if (n<0) {
            return false;
        }
        String str = Integer.toBinaryString(n);
        System.out.println(str);

        return (str.indexOf('1') == str.lastIndexOf('1') && str.length()%2 != 0 );
    }
}
