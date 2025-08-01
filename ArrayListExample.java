import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
	{
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println(arrayList); // Output: [Apple, Banana, Cherry]
        System.out.println(arrayList.get(1)); // Output: Banana
    }
}