import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class Lesson11 {
    public static void main(String[] args) throws IOException {

        try {
            System.out.println("Решение 1 задачи:");
            System.out.println(readValues("src/main/resources/Lesson1"));
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }

        try {
            System.out.println("Решение 2 задачи:");
            System.out.println(sumOfValues("src/main/resources/Lesson1")); // Решение 2 задачи
        } catch (IOException e) {
            System.out.println("Cумма ывходит за пределы значнеий Double");
        }

        // 3 задача
        souT("src/main/resources/Lesson1");

    }

    public static List<Double> readValues(String filename) throws IOException {

        List<Double> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
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

    public static double sumOfValues(String filename) throws IOException {

        List<Double> array = new ArrayList<>(readValues(filename));
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        if (sum == Double.MAX_VALUE || sum == Double.MIN_VALUE) {
            throw new IOException(String.format("сумма ывходит за пределы значнеий Double"));
        }
        return sum;
    }

    public static void souT(String filename) {
        try {
            System.out.println("Решение 3 задачи: " + sumOfValues(filename));
        } catch (IOException e) {
            System.out.println("Ловим на экран любые исключения");
        }
    }
}
