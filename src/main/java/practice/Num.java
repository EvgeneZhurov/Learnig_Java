package practice;

public class Num {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            result(i);
        }
}

    public static void result(int number) {
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;

        if (number + a * 100 + c * 10 + b == b * 100 + c * 10 + a) {
            System.out.println(number);
        }
    }
}
