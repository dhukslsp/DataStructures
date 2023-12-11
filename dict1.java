import java.util.Dictionary;
import java.util.Hashtable;

public class dict1 {

  public int[] numberTolist(int n) {
    int numLength = String.valueOf(n).length();
    int[] mylist = new int[numLength];
    int selnum = n;
    for (int i = 0; i < numLength; i++) {
      mylist[i] = selnum % 10;
      selnum = selnum / 10;
    }
    return mylist;
  }

  public int[] sortDesending(int[] Myarr12) {
    int temp = 0;
    for (int i = 0; i < Myarr12.length - 1; i++) {
      for (int j = 0; j <= i; j++) {
        if (Myarr12[j] < Myarr12[j + 1]) {
          temp = Myarr12[j];
          Myarr12[j] = Myarr12[j + 1];
          Myarr12[j + 1] = temp;
        }
      }
    }
    return Myarr12;
  }

  public int nextGreaterElement(int n) {
    dict1 obj1 = new dict1();
    int[] Myarr12 = obj1.numberTolist(n);
    int[] sortedArr = obj1.sortDesending(Myarr12);
    int numLength = String.valueOf(n).length();
    int ngNum = 0;
    if(numLength<=1){
        return -1;
    }
    for (int i : sortedArr) {
      ngNum = ngNum * 10 + i;
    }
    if (n >= ngNum) {
      return -1;
    } else {
      return ngNum;
    }
  }

  public static void main(String[] args) {
    int number = 101;
    dict1 obj1 = new dict1();
    int ans = obj1.nextGreaterElement(number);
    System.out.println(ans);
  }
}
