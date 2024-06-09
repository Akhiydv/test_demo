// Define the interface
interface Animal
 {
    // Abstract method (no implementation)
    void sound();
 }

// Implement the interface in the Dog class
class Dog implements Animal 
{
    // Provide the implementation for the sound method
    @Override
    public void sound()
	{
        System.out.println("The dog barks");
    }
}

// Implement the interface in the Cat class
class Cat implements Animal
 {
    // Provide the implementation for the sound method
    @Override
    public void sound()
	{
        System.out.println("The cat meows");
    }
}

public class InterfaceExample 
{
    public static void main(String args[])
	{
        // Create instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Call the sound method on both instances
        dog.sound();
        cat.sound();
    }
}
