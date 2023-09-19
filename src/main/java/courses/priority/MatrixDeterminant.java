package courses.priority;

public class MatrixDeterminant {
    public static void main(String[] args) {
        double[][] array = {
                {1, 3, 2, 3},
                {5, 6, 7, -5},
                {9, 10, 11, 11},
                {1, 2, 3, 7}
        };

        if (!isSquareMatrix(array)) {
            System.out.println("Матрица неквадратная. Определитель считается только у квадратных матриц.");
        } else if (array.length == 0) {
            System.out.println("У пустой матрицы нет определителя.");
        } else {
            System.out.println(getDeterminant(array));
        }
    }

    public static double getDeterminant(double[][] inputArray) {
        if (inputArray.length == 1) {
            return inputArray[0][0];
        }

        if (inputArray.length == 2) {
            return inputArray[0][0] * inputArray[1][1] - inputArray[1][0] * inputArray[0][1];
        }

        double determinant = 0;

        for (int i = 0; i < inputArray.length; i++) {
            double[][] outputArray = new double[inputArray.length - 1][inputArray.length - 1];

            for (int j = 0; j < inputArray.length - 1; j++) {
                for (int k = 1; k < inputArray.length; k++) {
                    if (j >= i) {
                        outputArray[k - 1][j] = inputArray[k][j + 1];
                        continue;
                    }

                    outputArray[k - 1][j] = inputArray[k][j];
                }
            }

            determinant += Math.pow(-1, i) * inputArray[0][i] * getDeterminant(outputArray);
        }

        return determinant;
    }

    public static boolean isSquareMatrix(double[][] array) {
        if (array.length != array[0].length) {
            return false;
        }

        for (int i = 0; i < array[0].length; i++) {
            if (array[i].length != array.length) {
                return false;
            }
        }

        return true;
    }
}