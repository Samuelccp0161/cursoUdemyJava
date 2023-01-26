package exercicio3;

import org.junit.Test;

import static exercicio3.QuestaoUm.*;
import static org.junit.Assert.*;

public class QuestaoUmTest {
    @Test
    public void SenhaTest(){
        assertFalse(vereficarSenha("2200"));
        assertFalse(vereficarSenha("1020"));
        assertFalse(vereficarSenha("2022"));
        assertTrue(vereficarSenha("2002"));
    }
}
