// Recursive Java program to find minimum 
import java.util.*; 
class MinElementRecursion
 { 
  public static int findMinRec(int arr[], int n) 
	{ 
	if(n==1) 
		return arr[0]; 
		return Math.min(arr[n-1], findMinRec(arr, n-1)); 
	} 
	// Main 
	public static void main(String args[]) 
	{ 
		int arr[]={8,1,5,4,15,10}; 
		int n=arr.length; 
		System.out.println(findMinRec(arr, n)); 
	} 
} 

