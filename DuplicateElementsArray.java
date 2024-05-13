import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsArray 
{
    public static void main(String args[])
	{
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3};
        
		Map<Integer, Integer> occurrences = findDuplicates(array);
        System.out.println("Duplicate elements and occurrences:");
        
		for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) 
		{
            System.out.println("Element: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
    
    public static Map<Integer, Integer> findDuplicates(int[] array)
	{
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        for (int num : array) 
		{
            if (occurrences.containsKey(num)) 
			{
                occurrences.put(num, occurrences.get(num) + 1);
            } 
			else 
			{
                occurrences.put(num, 1);
            }
        }
        
        Map<Integer, Integer> duplicates = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) 
		{
            if(entry.getValue() > 1) 
			{
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicates;
    }
}
