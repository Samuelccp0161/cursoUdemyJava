package exercise5.questao1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private final Rectangle rectangle = new Rectangle(3.00, 4.00);;

    @Test
    public void testGetArea() {
        assertEquals(12.00, rectangle.area(), 0.005);
    }
    @Test
    public void testGetPerimeter() {
        assertEquals(14.00, rectangle.perimeter(), 0.005);
    }
    @Test
    public void testGetDiagonal() {
        assertEquals(5.00, rectangle.diagonal(), 0.005);
    }
}