package courses.priority;

import java.util.Arrays;
public class QuickSorting {
    public static void main(String[] args) {
        int[] array = {2, 3, 15, 11, 9, 5, 12, 1, 4, 14, 6, 10, 7, 8, 13};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (right - left <= 0) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                changeArrayElements(array, left, right);
            }

            return;
        }

        int supportElement = (array[left] + array[right]) / 2;
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }

            while (array[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                changeArrayElements(array, i, j);
                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(array, i, right);
        }

        if (j > left) {
            quickSort(array, left, j);
        }
    }
    public static void changeArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}