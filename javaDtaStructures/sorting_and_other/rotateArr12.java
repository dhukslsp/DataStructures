class soloution{
	static void swap(int[] nums,int first,int last){
		int temp;
		while(first<last){
			temp  = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;
			first++;
			last--;
		}
	}
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		swap(nums,0,nums.length-1);
		swap(nums,0,k-1);
		swap(nums,k,nums.length-1);
    }
    static void printArr(int[] nums){
    	for(int i:nums){
    		System.out.print(i);
    		System.out.print(" ");
    	}
    	System.out.println();
    }
}
public class rotateArr12{
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		soloution sol = new soloution();
		sol.rotate(nums,k);
		sol.printArr(nums);
		
	}
}