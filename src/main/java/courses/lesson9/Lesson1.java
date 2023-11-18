package courses.lesson9;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int less = 0;
        int big = 0;

        for (int i : a) {
            if (x > i) {
                less++;
            } else {
                big++;
            }
        }

        System.out.println(less);
        System.out.println(big);
    }
}

