import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] firstArray = new int[]{742, 631, 520, 409, -563, -1, 0};
        int[] secondArray = new int[]{7442, -6341, 5420, 4094};
        int[] thirdArray = new int[]{};

        printArrayInfo(firstArray);
        printArrayInfo(secondArray);
        printArrayInfo(thirdArray);
    }

    public static void printArrayInfo(int[] array) {
        if (validation(array)) {
            System.out.println("Массив: " + Arrays.toString(array));
            System.out.println("Сумма равна: " + getSum(array));
            System.out.println("Самый большой элемент равен: " + getMaxArrayElement(array));
            System.out.println("Самый маленький элемент равен: " + getMinArrayElement(array));
            System.out.println("Разница самого большого и самого маленького элемента: " + getDifference(array));
            System.out.println("Сумма четных чисел массива равна:  " + getEvenNumbersSum(array));
            System.out.println("Сумма нечетных чисел массива равна:  " + getOddNumbersSum(array));
            System.out.println("Сумма отрицательных чисел массива равна:  " + getNegativeNumbersSum(array));
            System.out.println("Массив содержит нуль: " + isZero(array));
        } else {
            System.out.println("Данные введены некорректно");
        }
    }

    public static boolean validation(int[] array) {
        return array.length > 0;
    }

    public static int getSum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int getMaxArrayElement(int[] array) {
        int maxArrayElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxArrayElement < array[i]) {
                maxArrayElement = array[i];
            }
        }

        return maxArrayElement;
    }

    public static int getMinArrayElement(int[] array) {
        int minArrayElement = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minArrayElement > array[i]) {
                minArrayElement = array[i];
            }
        }

        return minArrayElement;
    }

    public static int getDifference(int[] array) {
        return getMaxArrayElement(array) - getMinArrayElement(array);
    }

    public static int getEvenNumbersSum(int[] array) {
        int evenNumbersSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersSum += array[i];
            }
        }

        return evenNumbersSum;
    }

    public static int getOddNumbersSum(int[] array) {
        int oddNumbersSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbersSum += array[i];
            }
        }

        return oddNumbersSum;
    }

    public static int getNegativeNumbersSum(int[] array) {
        int negativeNumbersSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeNumbersSum += array[i];
            }
        }

        return negativeNumbersSum;
    }

    public static boolean isZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;
            }
        }

        return false;
    }
}