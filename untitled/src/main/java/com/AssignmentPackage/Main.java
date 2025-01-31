package AssignmentPackage;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Meet", 28);
            person.changeDogsName("Rockey");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
