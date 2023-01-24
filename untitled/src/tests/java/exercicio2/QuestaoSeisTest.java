package exercicio2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestaoSeisTest {
    @Test
    public void intervaloTest(){
        double valor = 29;
        assertTrue(QuestaoSeis.intervalos(valor));

    }
}
