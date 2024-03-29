package lessons;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Lesson10 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // получаем текущую дату
        LocalDate clock = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(date);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d /n", dayOfMonth, month, year);

    }
}
