package courses.priority;

import java.util.Arrays;

public class PyramidSorting {
    public static void main(String[] args) {
        int[] array = {};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftElement(array, i, array.length - 1);
        }

        for (int i = array.length - 1; i >= 1; i--) {
            changeArrayElements(array, 0, i);
            siftElement(array, 0, i - 1);
        }
    }

    public static void siftElement(int[] array, int index, int maxIndex) {
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            if (rightChildIndex <= maxIndex && array[rightChildIndex] > array[leftChildIndex] && array[rightChildIndex] > array[index]) {
                changeArrayElements(array, index, rightChildIndex);
                index = rightChildIndex;

                continue;
            }

            if (leftChildIndex <= maxIndex && array[leftChildIndex] > array[index]) {
                changeArrayElements(array, index, leftChildIndex);
                index = leftChildIndex;

                continue;
            }

            return;
        }
    }

    public static void changeArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}