class binary1 {

  int binarySearch(int arr1[], int k, int l, int r) {
    if (r >= l) {
      int mid = l + (r - l) / 2;
      if (arr1[mid] == k) {
        return mid;
      }
      if (arr1[mid] < k) {
        return binarySearch(arr1, k, mid + 1, r);
      }
      return binarySearch(arr1, k, l, mid - 1);
    }
    return -1;
  }
}

public class intervalSearch {

  public static void main(String args[]) {
    int array1[] = { 1, 2, 354, 600 };
    binary1 placeobj1 = new binary1();
    int answer = placeobj1.binarySearch(array1, 600, 0, array1.length - 1);
    System.out.println(answer);
  }
}
