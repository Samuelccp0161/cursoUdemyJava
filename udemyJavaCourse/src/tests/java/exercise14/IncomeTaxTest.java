package exercise14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncomeTaxTest {
    @Test
    public void testIncomeTaxForIndividuals() {
        Individual individual = new Individual("Alex", 50000.00, 2000.00);

        assertEquals(11500.00, individual.tax(), 0.005);
    }
    @Test
    public void testIncomeTaxForCompany(){
        Company company = new Company("SoftTech", 400000.00, 25);

        assertEquals(56000.00, company.tax(), 0.005);
    }
}
