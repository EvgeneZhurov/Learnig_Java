
import java.util.Random;

public class MatrixRotation {
    public static void main(String[] args) {

        int[][] array = new int[8][8];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(256);
            }
        }

        rotation(array);
    }

    public static void rotation(int[][] array) {

        printMatrix(array);

        int[][] result = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[j][array.length-i-1] = array[i][j];
            }
        }
        printMatrix(result);
    }

    public static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] < 100) {
                    if (ints[j] < 10) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                System.out.print(ints[j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
