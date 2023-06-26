package exercise5.questao3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    @Test
    public void notaAlunoTest() {
        StudentGrade nota = new StudentGrade(27.00, 31.00, 32.00);

        assertEquals(90.00, nota.nota(), 0.005);
    }
    @Test
    public void passAlunoTest() {
        StudentGrade nota = new StudentGrade(27.00, 31.00, 32.00);

        assertTrue(nota.isApproved());
    }
    @Test
    public void failedAlunoTest() {
        StudentGrade nota = new StudentGrade(2.00, 31.00, 3.00);

        assertFalse(nota.isApproved());
    }
}
