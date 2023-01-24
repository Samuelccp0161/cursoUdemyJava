package exercicio2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class QuestaoSeteTest {
    @Test
    public void cartesianoTest(){
        double x = 2;
        double y = -2;

        assertTrue(QuestaoSete.cartesiano(x,y));
    }
}
