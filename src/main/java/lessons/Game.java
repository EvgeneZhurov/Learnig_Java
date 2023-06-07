package lessons;

import java.util.Random;

public class Game {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                Random r = new Random();
                r.nextInt(2);
                array[i][j] = r.nextInt(2);

            }
        }
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
        System.out.println();
        replaseElement(array, 1, 2);
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(isEnd(array));
    }

    public static int[][] replaseElement(int[][] array, int num1, int num2) {

        for (int i = 0; i < array.length; i++) {
            array[i][num2] = (array[i][num2] + 1) % 2;
            array[num1][i] = (array[num1][i] + 1) % 2;
        }
        array[num1][num2] = (array[num1][num2] + 1) % 2;
        return array;
    }

    public static boolean isEnd(int[][] array) {
        int check = array[array.length - 1][array.length - 1];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (check != ints[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
