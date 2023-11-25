package lessons;

public class Ticket {
    public static void main(String[] args) {
        for (int i = 0; i < 129; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        if (age <= 0 || age > 127) {
            return "Возраст введен некоректно. Проверьте введенное значение.";
        }

        if (age % 100 < 5 || age % 100 > 20) {
            if (age % 10 == 1) {
                return "Вам " + age + " год.";
            }
            if (age % 10 > 1 && age % 10 < 5) {
                return "Вам " + age + " года.";
            }
        }

        return "Вам " + age + " лет.";
    }
}
