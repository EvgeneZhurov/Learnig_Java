package lessons;

public class Lesson181 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 100; i < 1000; i++) {
            if (isTrue(i)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean isTrue(int num) {
        int a = num / 100;
        int b = (num - a * 100) / 10;
        int c = num - a * 100 - b * 10;
        a = a + b + c;
        if (a > 9) {
            b = a / 10;
            a = a - b * 10;
            return 5 == a + b;
        }
        return false;
    }
}
