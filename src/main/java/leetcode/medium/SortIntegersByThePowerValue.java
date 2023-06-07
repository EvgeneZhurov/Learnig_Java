package leetcode.medium;

import java.util.Arrays;

public class SortIntegersByThePowerValue {
    public static void main(String[] args) {
        System.out.println(getKth(12, 15, 2));
    }

    public static int getKth(int lo, int hi, int k) {

        if (lo == hi) {
            return lo;
        }
        int[] array = new int[hi - lo + 1];

        for (int i = 0; i < hi - lo + 1; i++) {

            array[i] = getPower(lo + i);
        }
        System.out.println(Arrays.toString(array));
        return getNum(array, k) + lo;
    }

    public static int getNum(int[] array, int k) {

        if (k == 1) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (min == array[i]) {
                    return i;
                }
            }

        }

        int[] array1 = new int[array.length];


        System.arraycopy(array, 0, array1, 0, array.length);
        Arrays.sort(array1);

        System.out.println(Arrays.toString(array1));

        return 0;
    }

    public static int getPower(int num) {

        int result = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            result++;
        }

        return result;
    }

}
