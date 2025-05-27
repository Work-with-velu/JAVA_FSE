import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class RecordExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nPeople older than 30:");
        people.stream()
              .filter(p -> p.getAge() > 30)
              .forEach(System.out::println);
    }
}