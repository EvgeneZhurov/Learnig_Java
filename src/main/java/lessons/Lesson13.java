package lessons;

public class Lesson13 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        try {
            System.out.println(divideNums(b, a));
        } catch (ArithmeticException e) {
            Exception e1 = new RuntimeException("Исключение из метода divideNums");
            throw new RuntimeException("Обратить внимание на делении на 0", e1);
        }
    }

    public static double divideNums(int num1, int num2) {

        int c;
        c = num1 / num2;
        return c;
    }
}
