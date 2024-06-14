public class ArrayIndexFinder
{
    //Function to find the first occurrence of a target value in the array
    public static int findFirstOccurrence(int array[], int target)
	{
        for(int i=0; i<array.length; i++)
		{
            if(array[i] == target) 
			{
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the target value is not found
    }

    public static void main(String args[]) 
	{
        // Test cases
        int array1[] = {0, 0, 0, 0, 1, 1, 1, 1};
        int array2[] = {1, 1, 1, 1, 0, 0, 0, 0};

        // Finding the first occurrence of 1 in array1
        int firstIndex1 = findFirstOccurrence(array1, 1);
        System.out.println("First occurrence of 1 in array1: " + firstIndex1);

        // Finding the first occurrence of 0 in array2
        int firstIndex2 = findFirstOccurrence(array2, 0);
        System.out.println("First occurrence of 0 in array2: " + firstIndex2);
    }
}
