import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Lesson20 {
    public static void main(String[] args) {

        Set<String> array = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] array2 = str1.strip().toLowerCase().split(" ");
        Collections.addAll(array, array2);
        System.out.println(array.size());
    }
}
