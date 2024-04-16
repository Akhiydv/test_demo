// Recursive Java program to find maximum 
import java.util.*; 
class MaxElementRecursion 
{ 
 public static int findMaxRec(int arr[], int n) 
	{ 
	if(n==1) 
		return arr[0]; 
		return Math.max(arr[n-1], findMaxRec(arr, n-1)); 
	} 
    // Main
	public static void main(String args[]) 
	{ 
		int arr[]={8,1,5,4,15,10}; 
		int n=arr.length; 
		System.out.println(findMaxRec(arr, n)); 
	} 
} 


