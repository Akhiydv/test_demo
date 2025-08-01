import java.util.HashSet;
import java.util.*;

public class HashSetExample 
{
    public static void main(String[] args) 
	{
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println(set); // Output: [Banana, Cherry, Apple] (order not guaranteed)
    }
}