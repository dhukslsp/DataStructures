import java.io.*;
import java.util.*;
public class SecondLargest{
	
	public static void main(String args[]){
			int arr[] = {9,9,9,9,9,9};
			//removing the duplicates from the array
			ArrayList<Integer> myarray = new ArrayList<>();
			for(int l = 0;l<arr.length;l++){
				if(!myarray.contains(arr[l])){
					myarray.add(arr[l]);
				}
				else{

				}
			}
			System.out.println(myarray);
			int size = myarray.size();
			if(size>=2){
				Collections.sort(myarray);
				System.out.println(myarray.get(size-2));
			}
			else{
				System.out.println(myarray.get(0));
			}
			
			// obj.Sorting(arr);
			// obj.printlist(arr);
			// System.out.println(arr[arr.length - 2]);
	}
}