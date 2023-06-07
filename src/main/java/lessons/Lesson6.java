package lessons;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        scanner.close();

        isShares(a,b);
    }

    public static void isShares(int num1, int num2){

        if (num1 % 2 == 0 || num2 % 3 == 0) {
            System.out.println(num1 == num2);
        }
        if (num1 % 2 == 0 && num1 % 3 == 0) {
            double result = Math.pow(num1, num2);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {    //в ином случае
                System.out.println((int) result);
            }
        }
    }
}

