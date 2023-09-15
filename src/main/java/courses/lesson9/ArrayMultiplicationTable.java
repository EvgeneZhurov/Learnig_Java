package courses.lesson9;

public class ArrayMultiplicationTable {
    public static void main(String[] args) {
        int maxNumber = 5;

        int[][] multiplicationTable = getMultiplicationTable(maxNumber);

        int digitsInNumberQuantity = getDigitsInNumberQuantity(
                multiplicationTable[multiplicationTable.length - 1][multiplicationTable[multiplicationTable.length - 1].length - 1]);

        String formatString = "%" + digitsInNumberQuantity + "d";

        for (int[] row : multiplicationTable) {
            for (int column : row) {
                System.out.printf(formatString, column);
            }

            System.out.println();
        }
    }

    public static int[][] getMultiplicationTable(int multiplicationTableSize) {
        int[][] multiplicationTable = new int[multiplicationTableSize][multiplicationTableSize];

        for (int i = 0; i < multiplicationTableSize; i++) {
            for (int j = 0; j < multiplicationTableSize; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static int getDigitsInNumberQuantity(int number) {
        int digitsInNumberQuantity = 1;

        while (number > 0) {
            digitsInNumberQuantity++;
            number /= 10;
        }

        return digitsInNumberQuantity;
    }
}
