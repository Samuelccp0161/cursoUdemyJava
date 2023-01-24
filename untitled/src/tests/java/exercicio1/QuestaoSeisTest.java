package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoSeisTest {
    @Test
    public void areasFigurasGeometricasTest(){
        double a = 3.0;
        double b = 4.0;
        double c = 5.2;

        assertEquals(7.80, QuestaoSeis.areaTriangulo(a, c), 0.002);
        assertEquals(84.94859360000001, QuestaoSeis.areaCirculo(c), 0.002);
        assertEquals(18.20, QuestaoSeis.areaTrapezio(a, b, c), 0.002);
        assertEquals(16.00, QuestaoSeis.areaQuadrado(b), 0.002);
        assertEquals(12.00, QuestaoSeis.areaRetangulo(a, b), 0.002);
    }
}
