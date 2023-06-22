package exercise3;

import org.junit.Test;

import static exercise3.QuestaoTres.combustivelCont;
import static org.junit.Assert.assertEquals;

public class QuestionThreeTest {
    @Test
    public void combustivelContador() {
        assertEquals("", combustivelCont(8));
        assertEquals("Alcool:", combustivelCont(1));
        assertEquals("", combustivelCont(7));
        assertEquals("Gasolina:", combustivelCont(2));
        assertEquals("Muito Obrigado", combustivelCont(4));
        assertEquals("Diesel:", combustivelCont(3));
    }
}
