package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoCincoTest {
    @Test
    public void calculoPecasTest(){
        int qtdPecasUm = 1, qtdPecasDois = 2;
        double valorPecasUm = 5.30, valorPecasDois = 5.10;
        assertEquals(15.50, QuestaoCinco.valorPecas(qtdPecasUm,qtdPecasDois,valorPecasUm,valorPecasDois), 0.002);
    }
}
