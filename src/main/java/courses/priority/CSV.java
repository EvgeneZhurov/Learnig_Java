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
                writer.println("    <tr>");

                StringBuilder sb = new StringBuilder();
                sb.append(scanner.nextLine());

                while (sb.lastIndexOf("\"") > sb.lastIndexOf(",")) {
                    sb.append(scanner.nextLine());
                }

                while (true) {
                    if (sb.indexOf(",") == -1) {
                        if (sb.indexOf("\"") == 0 && sb.indexOf("\"") == sb.length() - 1) {
                            sb.delete(0, 1);
                            sb.delete(sb.indexOf("\"") - 1, sb.lastIndexOf("\""));
                        }

                        writer.println("        <td>" + sb + "</td>");
                        break;
                    }

                    if (sb.indexOf("\"") == 0 && sb.indexOf("\"") < sb.indexOf(",")) {
                        sb.delete(0, 1);
                        sb.delete(sb.indexOf("\""), sb.indexOf("\",") + 1);
                    }

                    writer.println("        <td>" + sb.substring(0, sb.indexOf(",")) + "</td>");
                    sb.delete(0, sb.indexOf(",") + 1);
                }

                writer.println("    </tr>");
            }

            writer.print("</table>");
        }
    }
}


//TODO Написать конвертер из CSV в HTML

//TODO сделать проверку на спец символы

//TODO перечитать внимательно задачу



