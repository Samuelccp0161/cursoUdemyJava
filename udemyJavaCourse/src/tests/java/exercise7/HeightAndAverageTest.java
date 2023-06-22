package exercise7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class HeightAndAverageTest {
    @Test
    public void testAgesPercentage() {
        Person person1 = new Person("Joao", 15, 1.82);
        Person person2 = new Person("Maria", 16, 1.60);
        Person person3 = new Person("Teresa", 14, 1.58);
        Person person4 = new Person("Carlos", 21, 1.65);
        Person person5 = new Person("Paulo", 17, 1.78);

        Person[] people = {person1, person2, person3, person4, person5};
        assertEquals(2, Person.numberOfMinors(people), 0.005);
    }
    @Test
    public void testHeightPercentage() {
        Person person1 = new Person("Joao", 15, 1.82);
        Person person2 = new Person("Maria", 16, 1.60);
        Person person3 = new Person("Teresa", 14, 1.58);
        Person person4 = new Person("Carlos", 21, 1.65);
        Person person5 = new Person("Paulo", 17, 1.78);

        Person[] people = {person1, person2, person3, person4, person5};
        assertEquals(1.69, Person.averageHeight(people), 0.005);
    }
    @Test
    public void TestNamePerson() {
        Person person1 = new Person("Joao", 15, 1.82);
        Person person2 = new Person("Maria", 16, 1.60);
        Person person3 = new Person("Teresa", 14, 1.58);
        Person person4 = new Person("Carlos", 21, 1.65);
        Person person5 = new Person("Paulo", 17, 1.78);

        Person[] people = {person1, person2, person3, person4, person5};

        ArrayList<String> peopleOfMinors = new ArrayList<>();

        peopleOfMinors.add(person1.name);
        peopleOfMinors.add(person3.name);

        assertEquals(peopleOfMinors, Person.nameOfMinors(people));
    }
}
