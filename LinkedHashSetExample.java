import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
    public static void main(String args[]) 
	{
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println(set); // Output: [Apple, Banana, Cherry] (insertion order)
    }
}