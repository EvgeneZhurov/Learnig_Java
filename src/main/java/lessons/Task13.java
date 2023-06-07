package lessons;

import javax.annotation.processing.SupportedSourceVersion;
import java.awt.*;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aim = scan.nextInt();
        for (int i = 1; i <= aim; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(getNumberByCoord(i, j) + " ");
                if (i == 1) {
                    j = j + 1;
                }
            }
            System.out.println(" ");
        }
    }

    public static int factorial(int k) {
        int m = 1;
        for (int i = 2; i <= k; i++) {
            m = m * i;
        }
        return m;
    }

    public static double getNumberByCoord(int k, int l) {
        double b = (factorial(k) / (factorial(l - 1) * factorial(k - l + 1) * 1.0));
        return b;
    }

}
