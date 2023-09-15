package courses.priority;

public class Numbers {
    public static void main(String[] args) {
        int start = 2381895;
        int finish = 2761984;
        int result = 2381895;

        for (int i = start; i <= finish; i++) {
            if (sum(result) < sum(i)) {
                result = i;
            }
        }

        System.out.print(result);
    }

    public static int sum(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }
}
