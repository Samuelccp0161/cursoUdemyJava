package exercicio4;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestaoUmTest {
    @Test
    public void numerosImparesTest(){
        assertTrue(QuestaoUm.isImpar(7));
        assertFalse(QuestaoUm.isImpar(8));
    }
}
