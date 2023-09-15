package courses.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesQuantity {
    public static void main(String[] args) throws FileNotFoundException {
        int occurrencesQuantity = 0;

        try (Scanner scanner = new Scanner(new FileInputStream("NothingElseMatters.txt"))) {
            while (scanner.hasNextLine()) {
                occurrencesQuantity += getOccurrencesQuantity(scanner.nextLine(), "Nothing else matters");
            }
        }

        System.out.println("Число вхождений = " + occurrencesQuantity);
    }

    public static int getOccurrencesQuantity(String string, String target) {
        int occurrencesQuantity = 0;

        String lowerCaseString = string.toLowerCase();
        String lowerCaseTarget = target.toLowerCase();
        int index = 0;

        while (true) {
            index = lowerCaseString.indexOf(lowerCaseTarget, index);

            if (index == -1) {
                return occurrencesQuantity;
            }

            index += target.length();
            occurrencesQuantity++;
        }
    }
}