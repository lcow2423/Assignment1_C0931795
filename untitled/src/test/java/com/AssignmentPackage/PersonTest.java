package AssignmentPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testHasOldDog() {
        Person p1 = new Person("Alice", 30, new Dog("Buddy", 12));
        Person p2 = new Person("Bob", 25, new Dog("Charlie", 5));

        assertTrue(p1.hasOldDog());
        assertFalse(p2.hasOldDog());
    }

    @Test
    void testChangeDogsName() {
        Dog dog = new Dog("Max", 8);
        Person p = new Person("Charlie", 35, dog);

        p.changeDogsName("Rocky");
        assertEquals("Rocky", dog.getName());
    }

    @Test
    void testChangeDogsNameThrowsException() {
        Person p = new Person("David", 40);

        Exception exception = assertThrows(RuntimeException.class, () -> p.changeDogsName("Lucky"));
        assertEquals("David does not own a dog!", exception.getMessage());
    }
}

