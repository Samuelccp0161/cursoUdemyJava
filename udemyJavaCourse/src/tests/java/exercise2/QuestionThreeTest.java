package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionThreeTest {
    @Test
    public void multiplosTest(){
        int numero1 = 2;
        int numero2 = 3;
        int numero3 = 24;

        assertTrue(QuestaoTres.multiplos(numero1, numero3));
        assertFalse(QuestaoTres.multiplos(numero1, numero2));
        assertTrue(QuestaoTres.multiplos(numero3, numero2));
    }
}
