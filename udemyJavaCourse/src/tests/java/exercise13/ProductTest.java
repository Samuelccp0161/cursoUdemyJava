package exercise13;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void testProduct() {
        Product product = new Product("TV", 1500.00);
        assertEquals("TV $ 1500,00", product.priceTag());
    }

    @Test
    public void testImportedProduct() {
        ImportedProduct product = new ImportedProduct("Tablet", 260.00, 20.00);

        assertEquals(280.00, product.totalPrice(),0.005);
        assertEquals("Tablet $ 280,00 (Customs fee: $ 20,00)", product.priceTag());
    }

    @Test
    public void testUsedProduct() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        UsedProduct usedProduct = new UsedProduct("Iphone", 400, simpleDateFormat.parse("15/03/2017"));

        assertEquals("Iphone (used) $ 400,00 (Manufactured date: 15/03/2017)", usedProduct.priceTag());
    }
}
