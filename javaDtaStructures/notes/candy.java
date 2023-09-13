public class candy{
	public int candy(int ratings[]){
		int candy = 0;
		int i;
		for(i = 0;i<ratings.length;i++){
			if(i == 0){
				candy += 1;
				if(ratings[i]>ratings[i+1]){
					candy += 1;
				}
			}
			else if(i== ratings.length-1){
				candy += 1;
				if(ratings[i]>ratings[i-1]){
					candy += 1;
				}
			}
			else{
				candy+=1;
				if(ratings[i]>ratings[i-1]){
					candy += 1;
				}
				if(ratings[i]>ratings[i+1]){
					candy += 1;
				}
			}
		}
		return candy;
	}
	public static void main(String args[]){
		candy obj1 = new candy();
		int ratings[] = {1,2,2};
		System.out.println(obj1.candy(ratings));
	}
}