package courses.priority;

public class MatrixDeterminant {
    public static void main(String[] args) {
        double[][] matrix = {
                {1, 3, 2, 3},
                {5, 6, 7, -5},
                {9, 10, 11, 11},
                {1, 2, 3, 7}
        };

        if (matrix.length == 0) {
            System.out.println("У пустой матрицы нет определителя.");
        } else if (!isSquareMatrix(matrix)) {
            System.out.println("Матрица неквадратная. Определитель считается только у квадратных матриц.");
        } else {
            System.out.println("Определитель матрицы = " + getDeterminant(matrix));
        }
    }

    public static double getDeterminant(double[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        return getMatrixDeterminant(matrix);
    }

    private static double getMatrixDeterminant(double[][] matrix) {
        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }

        double determinant = 0;

        for (int i = 0; i < matrix.length; i++) {
            double[][] subMatrix = new double[matrix.length - 1][matrix.length - 1];

            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = 1; k < matrix.length; k++) {
                    if (j >= i) {
                        subMatrix[k - 1][j] = matrix[k][j + 1];
                        continue;
                    }

                    subMatrix[k - 1][j] = matrix[k][j];
                }
            }

            determinant += Math.pow(-1, i) * matrix[0][i] * getMatrixDeterminant(subMatrix);
        }

        return determinant;
    }

    public static boolean isSquareMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}