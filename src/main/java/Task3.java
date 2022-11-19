import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}