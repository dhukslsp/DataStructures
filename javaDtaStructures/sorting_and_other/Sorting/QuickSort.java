public class QuickSort{
	static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	static int quickSor(int arr[],int l,int r){
		int pivot = arr[r];
		int i = l - 1;
		for(int j = l;j<=r-1;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, r);
		return (i+1);
	}
	static void quick(int arr[],int l,int r){
		if(l<r){
			int center = quickSor(arr,l,r);
			quick(arr, 0, center-1);
			quick(arr, center + 1, r);
		}
	}
	static void printArray(int arr[]){
		for(int i:arr){
			System.out.print(i);
			System.out.print(" ");
		}
	}
	public static void main(String args[]){
		int arr[] = {10,80,30,90,40};
		int n = arr.length;
		quick(arr, 0, n-1);
		printArray(arr);
	}
}