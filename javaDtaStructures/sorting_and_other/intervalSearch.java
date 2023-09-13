class binary{
	public int search(int array1[],int x){
		int l = 0;
		int r = array1.length - 1;
		int mid = l + (r-l) / 2;
		while(mid<=r){
			mid = l + (r-l) / 2;
			if(array1[mid] == x){
				return mid;
			}
			if(array1[mid]<x){
				l = mid + 1;
			}
			if(array1[mid]>x){
				r = mid + 1;
			}
		}
		return -1;
	}
}
public class intervalSearch{
	public static void main(String args[]){
		int array1[] = {1,2,354,600};
		binary placeobj1 = new binary();
		int answer = placeobj1.search(array1,600);
		System.out.println(answer);
	}
}