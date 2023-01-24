package exercicio2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestaoCincoTest {
    @Test
    public void valorQuantidadeLancheTest(){
        int cod = 3;
        int qtd = 2;

        assertTrue(QuestaoCinco.lancheValor(cod, qtd));
    }
}
