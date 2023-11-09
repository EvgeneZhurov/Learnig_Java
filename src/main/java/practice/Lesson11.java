package practice;

public class Lesson11 {
    public static void main(String[] args) {
        double result = 0;
        int counter = 1;
        double epsilon = 0.0000000001;

        while (result < 50 - epsilon) {
            result += 1 / (Math.sqrt(2 * counter - 1) + Math.sqrt(2 * counter + 1));

            counter++;
        }

        System.out.println(counter - 1);
    }
}
