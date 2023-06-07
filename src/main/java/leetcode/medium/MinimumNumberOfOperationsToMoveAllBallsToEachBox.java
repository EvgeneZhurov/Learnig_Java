package leetcode.medium;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public static int[] minOperations(String boxes) {

        int[] result = new int[boxes.length()];
        int num = boxes.charAt(0) - 48;
        int num1 = 0;
        for (int i = 1; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                num1 += i;
                result[i] = 1;
                num--;
            }
        }
        result[0] = num1;
        for (int i = 1; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = result[i - 1] + num;
            } else {
                result[i] = result[i - 1] + num;
                num += 2 * result[i];
            }
        }
        return result;
    }
}
