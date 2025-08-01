import java.util.TreeSet;

public class TreeSetExample 
{
    public static void main(String[] args) 
	{
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);

        System.out.println(set); // Output: [1, 2, 3, 5] (sorted order)
    }
}