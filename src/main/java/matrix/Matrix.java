package matrix;

public class Matrix {

    private final int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    //получение матрицы
    public int[][] getMatrix() {
        return matrix;
    }

    //получение количества ячеек в строке
    public int getRows(int[][] matrix) {
        return matrix.length;
    }

    //получение количества ячеек в столбце
    public int getColumns(int[][] matrix) {
        return matrix[0].length;
    }

    //получение элемента матрицы
    public int getElement(int str, int col) {
        return matrix[str][col];
    }

    //установка элемент матрицы
    public void setElement(int str, int col, int num) {
        getMatrix()[str][col] = num;
    }

    //сложение матриц
    public static int[][] sumMatrix(int[][] matrix, int[][] matrix2) {
        int[][] matrixSum = new int[matrix.length][matrix[0].length];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                int numMatrix1 = matrix[y][x];
                int numMatrix2 = matrix2[y][x];
                int sum = numMatrix1 + numMatrix2;
                matrixSum[y][x] = sum;
            }
        }
        return matrixSum;
    }

    //умножение матриц
    public static  int[][] multiMatrix(int[][] matrix, int[][] matrix2) {
        int i, j, k;
        int row1 = matrix.length;
        int column1 = matrix[0].length;
        int column2 = matrix2[0].length;
        int[][] matrix3 = new int[row1][column2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < column2; j++) {
                for (k = 0; k < column1; k++) {
                    matrix3[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
}
