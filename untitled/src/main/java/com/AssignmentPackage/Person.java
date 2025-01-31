package AssignmentPackage;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;

    public Person(String name, Integer age) {
        this(name, age, null);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);
    }

    public boolean hasOldDog() {
        return dog.map(d -> d.getAge() >= 10).orElse(false);
    }

    public void changeDogsName(String newName) {
        dog.ifPresentOrElse(
                d -> d.setName(newName),
                () -> { throw new RuntimeException(this.name + " does not own a dog!"); }
        );
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    public Optional<Dog> getDog() { return dog; }
}
