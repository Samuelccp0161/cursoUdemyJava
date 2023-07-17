package exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    @Test
    public void testGradeStudent() {
        StudentGrade grade = new StudentGrade("",27.00, 31.00, 32.00);

        assertEquals(90.00, grade.grade(), 0.005);
    }
    @Test
    public void testPassStudent() {
        StudentGrade grade = new StudentGrade("",27.00, 31.00, 32.00);

        assertTrue(grade.isApproved());
    }
    @Test
    public void testFailedStudent() {
        StudentGrade grade = new StudentGrade("",2.00, 31.00, 3.00);

        assertFalse(grade.isApproved());
    }
}
