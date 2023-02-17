package exercicio5.questao3;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotaAlunoTest {

    @Test
    public void notaAlunoTest() {
        NotaAluno nota = new NotaAluno(27.00, 31.00, 32.00);

        assertEquals(90.00, nota.nota(), 0.005);
    }
    @Test
    public void passAlunoTest() {
        NotaAluno nota = new NotaAluno(27.00, 31.00, 32.00);

        assertTrue(nota.isApproved());
    }
    @Test
    public void failedAlunoTest() {
        NotaAluno nota = new NotaAluno(2.00, 31.00, 3.00);

        assertFalse(nota.isApproved());
    }
}
