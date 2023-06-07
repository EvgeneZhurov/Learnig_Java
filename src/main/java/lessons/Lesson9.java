package lessons;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {

        int[] array = new int[10];
        boolean isTrue = true;
        int n = 0;
        int i = 0;
        int result = 0;

        while (isTrue) {
            n++;
            try {
                if (isSimpleNum(n, n - 1)) {
                    array[i] = n;
                    i++;
                    result += n;
                }
            } catch (Exception e) {
                continue;
            }
            if (i == array.length) {
                isTrue = false;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(result);

    }

    public static boolean isSimpleNum(int num1, int num2) throws Exception {
        if (num1 == 2) {
            return true;
        }
            boolean result = true;
        if (num1 % (num2) == 0) {
            throw new Exception("");
        }
        if (num2 == 2) {
            return true;
        }
        isSimpleNum(num1, num2 - 1);
        return result;
    }
}
