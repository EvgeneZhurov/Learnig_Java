package lessons;

public class Lesson7 {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 6;

        isGoizontally(num1, num2);
        isVertically(num1, num2);
        isGoizontally(num1, num2);

    }

    public static void isGoizontally(int num1, int num2) {

        System.out.print(" ");
        for (int i = 0; i < num1; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public static void isVertically(int num1, int num2) {

        for (int j = 0; j < num2; j++) {
            System.out.print("|");
            for (int i = 0; i < num1; i++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}
