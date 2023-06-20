package exercicio7;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ApprovedTest {
    @Test
    public void testApproved() {
        Approved student1 = new Approved("Joao Silva", 7.0, 8.5);
        Approved student2 = new Approved("Maria Teixeira", 9.2, 6.5);
        Approved student3 = new Approved("Carlos Carvalho", 5.0, 6.0);
        Approved student4 = new Approved("Teresa Pires", 5.5, 6.5);

        Approved[] approved = {student1, student2, student3, student4};

        assertArrayEquals(new String[]{"Joao Silva","Maria Teixeira", null, "Teresa Pires"}, Approved.listApproved(approved));
    }
}