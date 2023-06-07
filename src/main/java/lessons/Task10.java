package lessons;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 50 - i;
        }

        System.out.println(Arrays.toString(array));

        // Метод пузырек

        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int num2 = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = num2;
                    isTrue = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
