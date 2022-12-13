import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lesson20 {
    public static void main(String[] args) {

        Set<String> array = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        StringBuilder str2 = new StringBuilder("");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str2.append(str1.charAt(i));
                continue;
            }
            if (str2.length() > 0) {
                String str = String.valueOf(str2);
                array.add(str);
                str2.delete(0, str2.length());
            }
        }
        if (!str2.isEmpty()) {

            String str = String.valueOf(str2);
            array.add(str);
        }
        System.out.println(array.size());
    }
}
