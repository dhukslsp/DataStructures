import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class Solution {

    public List<Integer> majorityElement(int[] nums) {
      Arrays.sort(nums);
      List<Integer> Mylist = new ArrayList<Integer>();
      HashMap<Integer, Integer> Map12 = new HashMap<>();
      //looping from the array and adding it to the map
      for (int num : nums) {
            Map12.put(num, Map12.getOrDefault(num, 0) + 1);
        }
	  int maxappear = nums.length/3;
	  Set<Integer> keys = Map12.keySet();
	  for(int key:keys){
			if(Map12.get(key)>maxappear){
				Mylist.add(key);
			}
	  }
      return Mylist;
    }
  }
public class majorityElm2 {
  public static void main(String args[]) {
    Solution obj1 = new Solution();
    int[] nums = {3,2,3};
    List<Integer> myListfund = obj1.majorityElement(nums);
    for (int i : myListfund) {
      System.out.println(i);
    }
  }
}
