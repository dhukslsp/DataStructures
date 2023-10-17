public class selectionSort{
	public static void main(String args[]){
		int myarr1[] = {23,45,56,1};
		int smallest;
		int temp;
		int length = myarr1.length;
		System.out.println("Printing the unsorted array ");
		for(int k:myarr1){
			System.out.print(k);
			System.out.print(" ");
		}
		System.out.println();
		for(int i = 0;i<length;i++){
			smallest = i;
			for (int j = i+1; j < length; j++) {
				if(myarr1[j]<myarr1[smallest]){
					smallest = j;
				}
			}
			temp = myarr1[smallest];
			myarr1[smallest] = myarr1[i];
			myarr1[i] = temp;
		}
		// printing the main List
		System.out.println("Printing the sorted array ");
		for(int j:myarr1){
			System.out.print(j);
			System.out.print(" .");
		}
	}
}