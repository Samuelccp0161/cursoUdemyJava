package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestaoDoisTest {
    @Test
    public void testAreaCirculo(){
        double raio = 2.00;

        assertEquals(12.56636, QuestaoDois.areaCirculo(raio), 0.000005);
    }
}
