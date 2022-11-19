import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class Lesson11 {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println(readValues());
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<Double> readValues() throws IOException {

        List<Double> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Lesson10"));
        String str = "";
        try {
            while ((str = reader.readLine()) != null) {
                array.add(Double.valueOf(str));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Данные в файле содержат неверный формат данных");
        } finally {
            reader.close();
        }


        return array;
    }
}
