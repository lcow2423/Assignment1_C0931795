package AssignmentPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testDogInitialization() {
        Dog dog = new Dog("Buddy", 5);
        assertEquals("Buddy", dog.getName());
        assertEquals(5, dog.getAge());
    }

    @Test
    void testSetName() {
        Dog dog = new Dog("Buddy", 5);
        dog.setName("Max");
        assertEquals("Max", dog.getName());
    }

    @Test
    void testSetAge() {
        Dog dog = new Dog("Buddy", 5);
        dog.setAge(8);
        assertEquals(8, dog.getAge());
    }
}
