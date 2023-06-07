package lessons;

import java.util.Scanner;

public class Facorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        double num = scanner.nextInt();

        isRoot(num, num);
    }

    public static double isRoot(double num, double res) {

        if (num == 1) {
            System.out.println(Math.sqrt(res));

            return Math.sqrt(res);
        }
        if (num < 1) {
            System.out.println("Значение меньше 1");

            return 0;
        }
        res = Math.sqrt(res);
        res = (res + (num - 1));
        isRoot(num - 1, res);

        return res;
    }
}


