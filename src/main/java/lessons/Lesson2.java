package lessons;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        //Создаем массив для заполнения простыми числами
        int[] array = new int[10];
        int i = 2;
        int j = 0;
        int sum = 0;

        //Создаем цикл, который будет работать до тех пор, пока массив нее наполнится числами полностью
        while (true) {
            if (isPrimeNumber(i)){
                array[j] = i;
                j++;
                sum += i;
            }
            if (j >= array.length) break;
           i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма всех чисел в массиве = " + sum);
    }

    // создаем метод, который возвращает true, если число простое и false, если составное
    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

