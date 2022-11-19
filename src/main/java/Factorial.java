import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

/*

// Задача 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num;
        do {
            num = scanner.nextInt();
            if (num != 1) {
                System.out.println("Не угадал! (ну ты Гендальф)");
            }
        } while (num != 1);
        System.out.println("Ну наконец то");
*/











        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();



        for (int i = 1; i < 11; i++) {
            if (num2 == i) {
                System.out.println("При первом числе = " + i + " : числа равны");
                continue;
            }
            if (i % 2 == 0) {
                System.out.println("При первом числе = " + i + " : сумма чисел = " + (i + num2));
                continue;
            }
            System.out.println("При первом числе = " + i + " : разность чисел = " + (i - num2));
        }





   /*     Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите гирину прямоугольника: ");
        int num2 = scanner.nextInt();
        System.out.print(" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
        for (int i = 0; i < num2; i++) {
            System.out.print("|");
            for (int j = 0; j < num1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("-");
        }
        System.out.print(" ");
*/





        /*       int result = 0;
        while (num > 0) {
            result += num % 10;
            num = num / 10;
        }
        System.out.println(result);*/


    }
}
