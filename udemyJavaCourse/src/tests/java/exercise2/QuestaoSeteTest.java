package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuestaoSeteTest {
    @Test
    public void cartesianoTest(){
        assertEquals("Q4",QuestaoSete.cartesiano(4.5,-2.2));
        assertEquals("Q1", QuestaoSete.cartesiano(0.1,0.1));
        assertEquals("ORIGEM",QuestaoSete.cartesiano(0.0,0.0));
    }
}
