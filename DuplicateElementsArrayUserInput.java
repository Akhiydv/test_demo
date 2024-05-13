import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementsArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
		{
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> occurrences = findDuplicates(array);

        System.out.println("Duplicate elements and occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) 
		{
            System.out.println("Element: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
        //scanner.close();
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
            if (entry.getValue() > 1) 
			{
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        return duplicates;
    }
}
