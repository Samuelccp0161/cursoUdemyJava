package exercicio5.questao1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RetanguloTest {

    private final Retangulo retangulo = new Retangulo(3.00, 4.00);;

    @Test
    public void testGetArea() {
        assertEquals(12.00, retangulo.area(), 0.005);
    }
    @Test
    public void testGetPerimeter() {
        assertEquals(14.00, retangulo.perimetro(), 0.005);
    }
    @Test
    public void testGetDiagonal() {
        assertEquals(5.00, retangulo.diagonal(), 0.005);
    }
}