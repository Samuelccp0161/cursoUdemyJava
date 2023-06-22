package exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionFiveTest {
    @Test
    public void valorQuantidadeLancheTest(){
        assertEquals(10,QuestaoCinco.lancheValor(3, 2), 0.005);
        assertEquals(13.50, QuestaoCinco.lancheValor(2, 3), 0.005);
    }
}
