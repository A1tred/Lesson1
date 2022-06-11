package matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void getMatrix() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        Matrix mx = new Matrix(matrix);
        assertArrayEquals(new int[][]{{0,1,2},{3,4,5},{6,7,8}}, mx.getMatrix());
    }

    @Test
    void getRows() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        Matrix mx = new Matrix(matrix);
        assertEquals(3, mx.getRows(matrix));
    }

    @Test
    void getColumns() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        Matrix mx = new Matrix(matrix);
        assertEquals(3, mx.getColumns(matrix));
    }

    @Test
    void getElement() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        Matrix mx = new Matrix(matrix);
        assertEquals(4, mx.getElement(1, 1));
    }

    @Test
    void setElement() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        Matrix x = new Matrix(matrix);
        x.setElement(1, 1, 23);
        assertArrayEquals(new int[][]{{0,1,2},{3,23,5},{6,7,8}}, x.getMatrix());
    }

    @Test
    void sumMatrix() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        int[][] matrix2 = {{0,1,2},{3,4,5},{6,7,8}};
        assertArrayEquals(new int[][]{{0,2,4},{6,8,10},{12,14,16}}, Matrix.sumMatrix(matrix, matrix2));
    }

    @Test
    void multiMatrix2() {
        int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};
        int[][] matrix2 = {{0,1,2},{3,4,5},{6,7,8}};
        assertArrayEquals(new int[][]{{15,18,21},{42,54,66},{69,90,111}}, Matrix.multiMatrix(matrix, matrix2));
    }
}