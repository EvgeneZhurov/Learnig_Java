import java.awt.image.MemoryImageSource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) throws IOException {
        List<Double> array = new ArrayList<>();

        try {
            array.addAll(readValues("src/main/resources/Lesson1"));
        } catch (IOException e) {
            System.out.println("Продолжай разбираться");
        }

        System.out.println("Код продолжил выполняться");


       try {
           double num = sumOfValues(array);
            System.out.println("Сумма = " + num);
        } catch (Exception e) {
            System.out.println("ловлю все ошибки метода sumOfValues");
        }

        System.out.println("Окончание метода main");
    }

    // Задача 1

    public static List<Double> readValues(String filename) throws IOException {

        List<Double> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        try {
            String line = br.readLine();
            while (line != null) {
                if (Double.valueOf(line) == Double.POSITIVE_INFINITY) {
                    throw new IOException();
                }
                array.add(Double.valueOf(line));
                line = br.readLine();
            }
        }  catch(ArithmeticException e) {
            System.out.println("Число больше максимально ввозможного");
        }
        finally {
            br.close();
        }
        return array;
    }

    //задание 2
    public static double sumOfValues(List<Double> array){

    double sum = array.get(0) + array.get(1);
        System.out.println(array);
        System.out.println(Double.MAX_VALUE);

        return sum;
    }

}
