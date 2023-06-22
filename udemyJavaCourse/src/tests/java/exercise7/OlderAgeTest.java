package exercise7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OlderAgeTest {
    @Test
    public void testOlderAge() {
        OlderAge person1 = new OlderAge("Carlos", 26);
        OlderAge person2 = new OlderAge("Teresa", 15);
        OlderAge person3 = new OlderAge("Joao", 16);

        OlderAge[] olderAges = {person1, person2, person3};
        assertEquals("Carlos", OlderAge.getMaiorIdade(olderAges));
    }
}