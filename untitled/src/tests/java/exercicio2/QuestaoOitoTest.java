package exercicio2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuestaoOitoTest {
    @Test
    public void impostoRenda(){
        assertEquals("80.36", QuestaoOito.impostoRenda(3002.00));
        assertEquals("Isento", QuestaoOito.impostoRenda(1701.12));
        assertEquals("355.6", QuestaoOito.impostoRenda(4520.00));
    }
}
