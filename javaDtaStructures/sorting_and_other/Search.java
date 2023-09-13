public class Search{
	public void sorting(int array1[]){
		int i,j,temp;
		for(i = 0;i<array1.length - 1;i++){
			boolean swap = false;
			for(j = 0;j<array1.length - i - 1;j++){
				if(array1[j]>array1[j+1]){
					temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false){
				break;
			}
		}
	}
	static void print(int array1[]){
		int i;
		for (i = 0;i<array1.length;i++){
			System.out.print(array1[i]);
			System.out.print(" ");
		}
	}
	public static void main(String args[]){
		int array1[] = {78,3,45,23,1,23};
		Search obj1 = new Search();
		obj1.sorting(array1);
	}
}