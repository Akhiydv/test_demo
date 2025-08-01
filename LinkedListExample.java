import java.util.LinkedList;

public class LinkedListExample 
{
    public static void main(String[] args) 
	{
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        System.out.println(linkedList); 
        linkedList.addFirst("Cat");
        System.out.println(linkedList); 
    }
}