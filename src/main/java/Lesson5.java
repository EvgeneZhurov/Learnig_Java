
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        //Задача 2
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + " число в массив: ");
            array[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Сумма " + (i + 1) + "го " + "и " + (i + 2) + "го чисел = " + (array[i] + array[i + 1]));
        }
        System.out.println("Сумма последнего и 1го чисел = " + (array[0] + array[array.length-1]));







        /*
        // Задача 1

        char[] array = new char[]{'Е', 'в', 'г', 'е', 'н', 'и', 'й'};

        String str = "";
        System.out.println(str);
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
        }

        System.out.println(str);*/
    }
}
