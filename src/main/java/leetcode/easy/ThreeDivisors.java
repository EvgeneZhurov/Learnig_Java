package leetcode.easy;

public class ThreeDivisors {
    public static void main(String[] args) {

        System.out.println(isThree(10));
    }

    public static boolean isThree(int n) {

        if (Math.sqrt(n) - (int) Math.sqrt(n) != 0 || n == 1) {
            return false;
        }
        int num = (int) Math.sqrt(n);
        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
