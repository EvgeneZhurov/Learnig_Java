import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 1;
        int num = 2;
        int sum = 2;
        array[0] = 2;
        while (i < 10) {
            if (isPrime(num, num - 1)) {
                array[i] = num;
                i++;
                sum += num;
            }
            num++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }

    // Метод проверяет, является ли число простым. Если да, то true.
    public static boolean isPrime(int num1, int num2) {

        if (num1 % num2 == 0) {
            return false;
        }
        if (num2 == 2) {
            return true;
        }
        return isPrime(num1, num2 - 1);
    }
}