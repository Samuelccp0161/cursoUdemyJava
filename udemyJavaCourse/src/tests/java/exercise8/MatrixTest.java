package exercise8;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void testArray() {
        int[][] array = {{1,2},{3,4}};
        assertArrayEquals(new int[][]{{1,2},{3,4}}, Matrix.getMatrix(array));
    }

    @Test
    public void testAddElementArray() {
        int[][] array = new int[2][2];

        Matrix.addElements(array,1);
        Matrix.addElements(array,2);
        Matrix.addElements(array,3);
        Matrix.addElements(array,4);

        assertArrayEquals(new int[][]{{1,2}, {3,4}}, Matrix.getMatrix(array));
    }

    @Test
    public void testPositionArray() {
        int[][] array = new int[2][2];

        Matrix.addElements(array,1);
        Matrix.addElements(array,2);
        Matrix.addElements(array,3);
        Matrix.addElements(array,4);

        assertEquals("Position 0,1:\nLeft: 1\nDown: 4", Matrix.position(array, 2));
    }
}