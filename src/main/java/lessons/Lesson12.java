package lessons;

import java.util.Scanner;

public class Lesson12 {

    public static String SPACE = "  ";
    public static String DASH = "==";
    public static String VERTICAL = "||";
    public static int LENGTH = 0;
    public static int WIDTH = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle's length: ");
        Lesson12.LENGTH = scanner.nextInt();

        System.out.println("Enter rectangle's width: ");
        Lesson12.WIDTH = scanner.nextInt();

        scanner.close();

        String horizontalLine = createHorizontalLine(LENGTH);
        String verticalLines = createVerticalLines(LENGTH, WIDTH);

        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);
        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = SPACE;

        for (int i = 0; i < length; i++) {
            horizontalLine += DASH;
        }

        horizontalLine += " \n";

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VERTICAL;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += SPACE;
        }

        verticalLinesUnit += VERTICAL + "\n";
        return verticalLinesUnit;
    }
}