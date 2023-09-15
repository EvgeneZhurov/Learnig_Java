package courses.priority;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 7, 83456, 56, 534, 111, 534456, -2};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = temp;
        }
    }
}
