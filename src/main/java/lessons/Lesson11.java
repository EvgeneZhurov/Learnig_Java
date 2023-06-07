package lessons;

import java.io.BufferedReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class Lesson11 {
    public static void main(String[] args) {

   /*     try {
            System.out.println("Решение 2 задачи:");
            System.out.println(sumOfValues("src/main/resources/Lesson1")); // Решение 2 задачи
        } catch (IOException e) {
            System.out.println("Cумма ывходит за пределы значнеий Double");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");
        }*/

        codeExeption();

    }

    public static List<Double> readValues(String filename) {

        List<Double> array = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String str = "";
            while ((str = reader.readLine()) != null) {
                array.add(Double.valueOf(str));
            }
        } catch (Exception e) {
            array.add(999.987789987789987987789987);
        }

        return array;
    }

    public static double sumOfValues(String filename) throws IOException, NumberFormatException {

        List<Double> array = readValues(filename);
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
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

    //Решение 4 задачи
    public static void codeExeption() {

        List<Double> array = readValues("src/main/resources/Lesson1");
        if (!array.contains(999.987789987789987987789987)) {
            System.out.println("ошибки нет");
        } else {
            System.out.println("ошибка есть");
        }
    }
}
