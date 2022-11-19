import java.nio.charset.StandardCharsets;
import java.util.Locale;

// Программа должна выводить только последнее слово из введенного текста
public class Task4 {
    public static void main(String[] args) {
        String str = " Fly me to    the    moon   ";
        int step = 0;
        //Проверка - не состоит ли строка из одних пробелов!
        String stringWithoutSpaces = str.trim();
        int leigthLine = stringWithoutSpaces.length();
        if (stringWithoutSpaces.length() < 1) {
            System.out.println("Текст состоит только из пробелов или его вовсе нет!");
        } else {
            for (int i = leigthLine - 1; i > 0; --i) {
                char stringWq = stringWithoutSpaces.charAt(i);
                String s = String.valueOf(stringWq);
                String str1 = " ";
                if (s.equals(str1)) {
                    //  System.out.println("Statement is true");
                    step = i;
                    i = 0;
                } else {
                    //   System.out.println("Statement is false");
                }
            }
            //     System.out.println(step);
            String str2 = str.substring(step + 1);
            System.out.println(str2);

            //  char stringWq1 = str1.charAt(0);
            // System.out.println( stringWq1 == stringWq);

            //    int leigthLineFull = str.length();
            //      System.out.println(leigthLine);//Количество символов в тексте без пробелов в начале и конце
            //   System.out.println(stringWq);
            // System.out.println(leigthLine);
        }
    }
}
