import java.text.DecimalFormat;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения: ");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        System.out.println(solveQuadraticEquation(a, b, c));
        in.close();
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c != 0) {
            return "Количество решений: 0.";
        }
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }

        byte count = getNumSolution(a, b, c);
        DecimalFormat format = new DecimalFormat("0.###");
        if (count == 2) {
            double x1 = getFirstSolution(a, b, c);
            double x2 = getSecondSolution(a, b, c);

            if (x1 > x2) {
                return "Количество решений: 2. Корни: " + format.format(x2) + ";" + format.format(x1);
            }
            if (x1 < x2) {
                return "Количество решений: 2. Корни: " + format.format(x1) + ";" + format.format(x2);
            }
        }
        if (count == 1) {
            return "Количество решений: 1. Корень: " + format.format(getFirstSolution(a, b, c));
        }
        return "Количество решений: 0.";
    }

    static byte getNumSolution(double a, double b, double c) {
        if (a == 0 && b != 0 && c != 0) {
            return 1;
        }

        double d = b * b - 4 * a * c;
        if (d > 0) {
            return 2;
        }
        if (d == 0) {
            return 1;
        }
        return 0;
    }

    static double getFirstSolution(double a, double b, double c) {
        if (a == 0 && b != 0 && c != 0) {
            return (-c / b);
        }
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    static double getSecondSolution(double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }
}
