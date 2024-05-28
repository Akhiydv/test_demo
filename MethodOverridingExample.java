// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Another Subclass
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myDog.makeSound(); // Should print "The dog barks"
        myCat.makeSound(); // Should print "The cat meows"
    }
}
