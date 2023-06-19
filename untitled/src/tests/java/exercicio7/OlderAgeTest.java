package exercicio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OlderAgeTest {
    @Test
    public void testOlderAge() {
        int[] ages = {45, 12, 15};

        assertEquals(45, OlderAge.maiorIdade);
    }
}