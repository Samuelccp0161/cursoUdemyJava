package exercicio2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestaoQuatroTest {
    @Test
    public void diferencaHorasTest(){
        int horasInicial = 2;
        int horasFinal = 16;
        int horasMaxima = 24;
        int horasMinima = 0;

        assertTrue(QuestaoQuatro.diferencaHoras(horasFinal,horasInicial));
        assertTrue(QuestaoQuatro.diferencaHoras(horasMinima, horasMaxima));
        assertTrue(QuestaoQuatro.diferencaHoras(horasFinal, horasInicial));
    }
}
