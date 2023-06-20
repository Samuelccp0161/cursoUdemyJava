package exercicio7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataPeopleTest {
    @Test
    public void testDataPeople() {
        DataPeople people1 = new DataPeople(1.70, "F");
        DataPeople people2 = new DataPeople(1.83, "M");
        DataPeople people3 = new DataPeople(1.54, "M");
        DataPeople people4 = new DataPeople(1.61, "F");
        DataPeople people5 = new DataPeople(1.75, "F");

        DataPeople[] people = {people1, people2, people3, people4, people5};
        assertEquals(1.69, DataPeople.AverageHeightWoman(people));
    }
}
