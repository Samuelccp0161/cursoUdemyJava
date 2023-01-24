package exercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestaoQuatroTest {
    @Test
    public void calculoSalarioTest(){
        int horasTrabs = 100;
        double salarioPorHora = 5.50;

        assertEquals(550.00, QuestaoQuatro.salario(horasTrabs, salarioPorHora), 0.002);
    }
}
