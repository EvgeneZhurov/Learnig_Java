package courses.lesson12;

import java.util.Arrays;

public class StringSplitting {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";

        String[] numberStrings = string.split(", ");

        int sum = 0;
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
            sum += numbers[i];
        }

        System.out.println("Массив переведен из String в int " + Arrays.toString(numbers));
        System.out.println("Сумма чисел = " + sum);
    }
}
