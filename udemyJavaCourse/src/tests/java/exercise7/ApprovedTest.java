package exercise7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ApprovedTest {
    @Test
    public void testApproved() {
        Student student1 = new Student("Joao Silva", 7.0, 8.5);
        Student student2 = new Student("Maria Teixeira", 9.2, 6.5);
        Student student3 = new Student("Carlos Carvalho", 5.0, 6.0);
        Student student4 = new Student("Teresa Pires", 5.5, 6.5);

        Student[] student = {student1, student2, student3, student4};

        assertArrayEquals(new String[]{"Joao Silva","Maria Teixeira", "Teresa Pires"}, Student.listApproved(student));
    }
}