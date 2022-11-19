import java.util.Arrays;

public class LessonExeption {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println(sum(a, b));

        int[] array = new int[10];
        int n = 11;


        try {
            isMetod(11);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Число больше чем элементов в массиве");
        }



        /*int num = -2;
        double num2 = sqrt(num);
        if (num2 == -1) {
            System.out.println("это была ошибка");
        } else {
            System.out.println("Код работает исправно");
        }
        System.out.println(num2);*/
    }

    public static double sqrt(int num) {
        if (num < 0) return -1;
        return Math.sqrt(num);
    }

    public static int sum(int num1, int num2) {

        return num1 / num2;
    }

    public static int[] isMetod(int n)  {
        int[] array = new int[10];

        array[n] = 5;
        return array;
    }
}
