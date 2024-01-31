package leetcode.hard;

import java.util.Arrays;

public class ReducingDishes {
    public static void main(String[] args) {
        int[] array = new int[]{-1,-4,-5};

        System.out.println(maxSatisfaction(array));
    }

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int result = 0;
        int sum = 0;

        for (int i = satisfaction.length - 1; i >= 0; i--) {
            sum += satisfaction[i];

            if (sum < 0) {
                break;
            }

            result += sum;
        }

        return result;
    }
}
