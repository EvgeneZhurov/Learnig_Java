import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();

        printString(s);
    }

    public static String isAnswer(String s) {

        return switch (s) {
            case "Hi" -> "Hello";
            case "Bye" -> "Good bye";
            case "How are you" -> "How are your doing";
            default -> "Unknown message";
        };
    }

    public static void printString(String s){
        System.out.println(s);
    }
}







