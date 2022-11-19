import java.util.Scanner;

public class introductionOop {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        counter1.name = "counter1";

        Counter counter2 = new Counter();
        counter2.name = "counter2";

       Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте шаг счетчика ");
        int step = scanner.nextInt();
/*
        //Пример реализации шага счетчика
        counter1.stepPlus(step);
        counter1.stepPlus(step);
        System.out.println("Значение счетчика с заданным шагом = " + counter1.value);
*/
        //Подчет количества четных и количество нечетных чисел в ряду от 1 до 100
        int resultEven = 0;
        int resulOdd = 0;
        counter1.plusOne();
        while (counter1.value < 101) {
            if (counter1.value % 2 == 0 && counter1.value > 0) {
                resultEven++;
            } else {
                resulOdd++;
            }
            counter1.plusOne();
        }

        System.out.println("Четные числа: " + resultEven);
        System.out.println("Нечетные числа: " + resulOdd);
        counter2.plusOne(); // тестировнаие счетчика
    }
}

class Counter {
    String name = "";
    int value;    // Создаю поле четных чисел

    //конструктор, увеличивающий значение счетчика на 1
    void plusOne() {
        this.value += 1;
    }

    //конструктор, уменьшающий значение счетчика на 1
    void subtractingOne() {
        this.value -= 1;
    }

    //конструктор, увеличивающий значение счетчика на заданнное пользователем значение
    void stepPlus(int num1) {
        this.value += num1;
    }

    //конструктор, увеличивающий значение счетчика на заданнное пользователем значение
    void stepSubtracting(int num1) {
        this.value -= num1;
    }
}




