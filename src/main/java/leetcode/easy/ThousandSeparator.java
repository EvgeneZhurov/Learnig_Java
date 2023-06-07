package leetcode.easy;

public class ThousandSeparator {
    public static void main(String[] args) {

        System.out.println(thousandSeparator(123));
    }


    public static String thousandSeparator(int n) {

        StringBuilder str = new StringBuilder(Integer.toString(n));
        for (int i = Integer.toString(n).length() / 3; i > 0; i--) {
            if (3 * i != Integer.toString(n).length()) {
                str.insert(str.length() - 3 * i, ".");
            }
        }
        return String.valueOf(str);
    }

}
