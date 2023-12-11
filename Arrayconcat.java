public class Arrayconcat {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int maxLength = nums.length-1;
        int[] answer = new int[n];
        for(int i = 0;i<n;i++){
            if(i == maxLength){
                answer[i] = nums[i+maxLength];
            }
            else{
                answer[i] = nums[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Arrayconcat myarr12 = new Arrayconcat();
        int[] myarr = {1,3,2,1};
        int[] ans = myarr12.getConcatenation(myarr);
        for(int i:ans){
            System.out.println(i);
        }
    }
}
