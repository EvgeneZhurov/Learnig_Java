package practice;

import java.util.Scanner;

public class LessonAkr {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0 && a < 8) {

            if (a < 6) {
                System.out.println("Будний день");
            } else {
                System.out.println("Выходной");
            }

        } else {
            System.out.println("Число введено не корректно");
        }


    }

}

