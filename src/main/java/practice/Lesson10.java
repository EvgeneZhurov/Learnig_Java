package practice;

public class Lesson10 {
    public static void main(String[] args) {

        for (int i = 1; i <10000000; i++) {
            if (isTwo(i) && isTree(i) && isSeven(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isTwo(int num) {
        return num % 2 == 1;
    }

    public static boolean isTree(int num) {
        return num % 5 == 2;
    }

    public static boolean isSeven(int num) {
        return num % 17 == 3;
    }
}
