abstract class Animal 
{
	public static void main(String args[])
	{
    abstract void sound(); // Abstract method
    void sleep() 
	{ // Concrete method
        System.out.println("The animal is sleeping");
    }
} 
}

class Dog extends Animal 
{
    @Override
    void sound()
	{
        System.out.println("The dog barks");
    }
}
