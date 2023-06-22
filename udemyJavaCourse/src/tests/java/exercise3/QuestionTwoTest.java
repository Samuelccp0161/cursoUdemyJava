package exercise3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {
    @Test
    public void cartesianoTest(){
        Assert.assertEquals("primeiro", QuestaoDois.sistemaCartesiano(2, 2));
        Assert.assertEquals("quarto", QuestaoDois.sistemaCartesiano(3, -2));
        Assert.assertEquals("terceiro", QuestaoDois.sistemaCartesiano(-8, -1));
        Assert.assertEquals("segundo", QuestaoDois.sistemaCartesiano(-7, 1));
        Assert.assertEquals("", QuestaoDois.sistemaCartesiano(0, 2));

    }
}
