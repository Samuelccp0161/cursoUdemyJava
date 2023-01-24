package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoUmTest {
    @Test
    public void testSoma(){
        int x = 10;
        int y = 30;

        QuestaoUm.soma(x,y);

        assertEquals(40, QuestaoUm.soma(x,y));
    }
}
