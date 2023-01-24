package exercicio2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoUmTest {
    @Test
    public void PositivoOuNegativoTest(){
        int numberNegativo = -12;
        int numberPositivo = 12;

        assertEquals(-12, QuestaoUm.PositivoOuNegativo(numberNegativo));
        assertEquals(12, QuestaoUm.PositivoOuNegativo(numberPositivo));
    }
}
