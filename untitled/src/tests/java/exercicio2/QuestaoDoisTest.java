package exercicio2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoDoisTest {
    @Test
    public void paridadeTest(){
        int par = 2;
        int impar = 3;

        assertEquals(2, QuestaoDois.paridade(par));
        assertEquals(3, QuestaoDois.paridade(impar));
    }
}
