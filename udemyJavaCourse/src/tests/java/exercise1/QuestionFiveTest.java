package exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuestionFiveTest {
    @Test
    public void testPiecesCalculation(){
        int quantityPiecesOne = 1;
        int quantityPiecesTwo = 2;
        double valuePiecesOne = 5.30;
        double valuePiecesTwo = 5.10;

        assertEquals(15.50, QuestionFive.valuePieces(quantityPiecesOne,quantityPiecesTwo,valuePiecesOne,valuePiecesTwo), 0.002);
    }
}
