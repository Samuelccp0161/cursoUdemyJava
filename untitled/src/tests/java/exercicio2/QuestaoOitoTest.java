package exercicio2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QuestaoOitoTest {
    @Test
    public void impostoRenda(){
        double salario = 4582;
        assertTrue(QuestaoOito.impostoRenda(salario));
    }
}
