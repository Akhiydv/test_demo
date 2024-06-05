public class MergeSortExample
{
    public static void main(String args[])
    {
        int array[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(array);
        
        //Call mergeSort to sort the array
        mergeSort(array, 0, array.length - 1);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(array);
    }

    // Function to implement merge sort
    public static void mergeSort(int[] array, int left, int right)
	{
        if (left < right)
		{
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort the first half
            mergeSort(array, left, middle);

            // Recursively sort the second half
            mergeSort(array, middle + 1, right);

            // Merge the two halves
            merge(array, left, middle, right);
        }
    }

    // Function to merge two subarrays
    public static void merge(int[] array, int left, int middle, int right)
	{
        //Find sizes of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //Copy data to temporary arrays
        for(int i = 0; i < n1; ++i)
		{
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < n2; ++j)
		{
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Function to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
