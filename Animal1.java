interface Animal1 
{
    void sound(); // Abstract method
}

class Dog implements Animal1 {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}
