package courses.priority;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSV {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.csv")); PrintWriter writer = new PrintWriter("output.html")) {
            writer.println("<table>");

            while (scanner.hasNextLine()) {
                StringBuilder sb = new StringBuilder();
                sb.append(scanner.nextLine());

                writer.println("    <tr>");

                while (true) {
                    if (sb.indexOf(",") == -1) {
                        writer.println(sb);

                        break;
                    }

                    writer.print("        <td>");

                    writer.println(sb.substring(0, sb.indexOf(",")) + "</td>");
                    writer.print("        <td>");

                    sb.delete(0, sb.indexOf(",") + 1);


              /*  if (sb.indexOf("\"") == 0) {
                    while (true) {
                        if (sb.lastIndexOf("\"") == sb.indexOf("\"")) {
                            sb.append("<br/>");
                            sb.append(scanner.nextLine());
                        }

                        break;
                    }

                    sb.delete(0, 1);
                    sb.delete(sb.indexOf("\","), sb.indexOf("\",") + 1);
                }*/

                    writer.println(sb);
                }

                writer.println("    </tr>");
            }

            writer.print("</table>");
        }

        //TODO Написать конвертер из CSV в HTML

        //TODO сделать проверку на спец сиволы

        //TODO перечитать  внимательно задачу


    }
}
