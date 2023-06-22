package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionFourTest {
    @Test
    public void diferencaHorasTest(){
        assertEquals(10, QuestaoQuatro.diferencaHoras(16,2));
        assertEquals(24, QuestaoQuatro.diferencaHoras(0,0));
        assertEquals(14, QuestaoQuatro.diferencaHoras(2, 16));
    }
}
