public class bubbleSor{
	public static void main(String args[]){
		int arr[] = {-1,45,0,11,-9};
		int k,i;
		int temp;
		for( k = arr.length-1;k>0;k--){
			for(i = 0;i<k;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		// printing the array;
		for(int l:arr){
			System.out.print(l);
			System.out.print(" ");
		}
	}
}