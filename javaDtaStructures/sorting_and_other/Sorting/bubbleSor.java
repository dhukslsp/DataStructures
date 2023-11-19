public class bubbleSor{
	public static void main(String[] args) {
		int arr[] = {4,45,0,2,45,34,23};
		int temp;
		for(int j = arr.length - 1;j>=0;j--){
			for(int i = 0;i<j;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int elm:arr){
			System.out.println(elm);
		}
	}
	
}