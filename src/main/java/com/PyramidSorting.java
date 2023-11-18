package com;
import java.util.Arrays;

public class PyramidSorting {
    public static void main(String[] args) {
        int[] array = {2, 3, 15, 11, 9, 5, 12, 1, 4, 14, 6, 10, 7, 8, 13};

  //      Arrays.sort();
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        if (array.length == 0) {
            return;
        }

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftArray(array, i, array.length - 1);
        }

        for (int i = array.length - 1; i >= 1; i--) {
            siftArray(array, 0, i);
            changeArrayElements(array, 0, i);
        }
    }

    public static void siftArray(int[] array, int index, int maxIndex) {
        do {
            int rightChild = 2 * index + 2;
            int leftChild = 2 * index + 1;

            if (rightChild <= maxIndex && array[rightChild] > array[leftChild] && array[rightChild] > array[index]) {
                changeArrayElements(array, index, 2 * index + 2);
                index = rightChild;

                continue;
            } else if (leftChild <= maxIndex && array[leftChild] > array[index]) {
                changeArrayElements(array, index, 2 * index + 1);
                index = leftChild;
                continue;
            }

            break;
        } while (true);
    }


    public static void changeArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

