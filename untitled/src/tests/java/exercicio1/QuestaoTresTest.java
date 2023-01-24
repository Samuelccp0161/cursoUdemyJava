package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoTresTest {
    @Test
    public void diferencaTest() {
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;

        assertEquals(-26, QuestaoTres.diferenca(a,b,c,d));
    }
}
