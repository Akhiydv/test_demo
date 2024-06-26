import java.util.*;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // Simple hash code implementation combining name and age
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 30);

        // Using HashMap
        Map<Person, String> personMap = new HashMap<>();
        personMap.put(person1, "Engineer");
        personMap.put(person2, "Doctor");
        personMap.put(person3, "Teacher");

        System.out.println("HashMap contents:");
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using HashSet
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("HashSet contents:");
        for (Person person : personSet) {
            System.out.println(person);
        }

        // Checking equality
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
    }
}
