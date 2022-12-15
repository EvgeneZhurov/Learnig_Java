package lessons;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Lesson20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        String[] arrayWords = string.strip()
                .toLowerCase()
                .split(" ");

        Set<String> arrayUniqueWords = new TreeSet<>();
        Collections.addAll(arrayUniqueWords, arrayWords);

        System.out.println(arrayUniqueWords.size());
    }
}
