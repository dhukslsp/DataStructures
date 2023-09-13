// Java program for implementation of Selection Sort
import java.io.*;
public class listnode
{
	public void sort(int arr[])
	{
		int emp;
		int smallest = 0;
		for(int i = 0;i<arr.length;i++){
			smallest = i;
			for(int x = i;x<arr.length;x++){
				if(arr[smallest] > arr[x]){
					smallest = x;
				}
			}
			emp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = emp;
		}
	}

	// Prints the array
	public void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[])
	{
		listnode ob = new listnode();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra*/
