package leetcode.easy;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {

        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            result++;
        }

        return result;
    }
}
