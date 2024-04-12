public class HighestNumberInArray 
{
    public static void main(String args[])
	{
		int arr[]={10, 7, 25, 4, 0}; /Example array
        int maxNumber=findMax(arr, arr.length); //Call the recursive function to find the maximum number in the array
        System.out.println("The highest number in the array is: " + maxNumber);
    }
	static int findMax(int arr[], int n)// Recursive function to find the highest number in an array
	{
         if(n==1)// Base case: if there's only one element in the array
            return arr[0];
         int maxInSubArray=findMax(arr, n-1);// Recursive call to find the maximum number in the sub-array excluding the last element
         return Math.max(maxInSubArray, arr[n-1]);// Compare the maximum of the sub-array with the last element of the array
    }
}
