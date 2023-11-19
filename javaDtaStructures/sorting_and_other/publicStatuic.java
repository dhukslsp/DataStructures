package javaDtaStructures.sorting_and_other;

public class publicStatuic {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int pMerge = m + n - 1;

    while (p2 >= 0) {
      if (p1 >= 0 && nums1[p1] > nums2[p2]) {
        nums1[pMerge--] = nums1[p1--];
      } else {
        nums1[pMerge--] = nums2[p2--];
      }
    }
  }

  public void printArr(int[] nums1) {
    for(int i:nums1){
        System.out.println(i);
    }
  }

  public static void main(String[] args) {
    publicStatuic mys1 = new publicStatuic();
    int[] myarr = { 1, 2, 3, 0, 0, 0 };
    int[] myarr2 = { 2, 5, 6 };
    mys1.merge(myarr, 3, myarr2, 3);
    mys1.printArr(myarr);
  }
}
