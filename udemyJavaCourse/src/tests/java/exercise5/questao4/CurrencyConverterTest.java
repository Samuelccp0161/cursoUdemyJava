package exercise5.questao4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyConverterTest {
    @Test
    public void dollarToRealTest() {
        assertEquals(657.20, CurrencyConverter.converterToReal(3.10, 200), 0.005);
    }
}
