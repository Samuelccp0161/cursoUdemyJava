package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionSixTest {
    @Test
    public void intervaloTest(){
        assertEquals("(25,50]", QuestaoSeis.intervalos(25.01));
        assertEquals("([0,25]", QuestaoSeis.intervalos(25.00));
        assertEquals("(75,100])", QuestaoSeis.intervalos(100.00));
        assertEquals("Fora do intervalo", QuestaoSeis.intervalos(-25.02));
    }
}
