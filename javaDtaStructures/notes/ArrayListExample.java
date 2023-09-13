// Java program to demonstrate the
// working of ArrayList
import java.io.*;
import java.util.*;

class ArrayListExample {
	public static void main(String[] args)
	{
		int i;
		int j;
		ArrayList<Integer> myarray = new ArrayList<>();
		// adding
		for(i = 0;i<9;i++){
			myarray.add(i);
		}
		// Printing The elements of the array
		for(j=0;j<9;j++){
			System.out.println(myarray.get(j));
		}
	}
}
