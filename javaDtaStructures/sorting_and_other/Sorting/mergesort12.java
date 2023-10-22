public class mergesort12 {

  static void merge(int arr12[], int p, int q, int r) {
    int m = q - p + 1;
    int n = r - q;
    int M[] = new int[m];
    int N[] = new int[n];
    //Storing the data in the array One by one;
    for (int i = 0; i < m; i++) {
      M[i] = arr12[p + i];
    }
    for (int k = 0; k < n; k++) {
      N[k] = arr12[q + 1 + k];
    }
    //Making the final form
    int i = 0;
    int j = 0;
    int point = p;
    while(i<m && j<n){
        if(M[i] >= N[j]){
            arr12[point] = N[j];
            j += 1;
        }
        else{
            arr12[point] = M[i];
            i += 1;
        }
        point += 1;
    }

    //Inserting the remaining element into the array
    while(i<m){
        arr12[point] = M[i];
        i++;
        point ++;
    }
    while(j<n){
        arr12[point] = N[j];
        j++;
        point ++;
    }

  }

  static void mergesort(int arr12[], int l, int r) {
    if (l < r) {
      int m = l + (r-l) / 2;
      mergesort(arr12, l, m);
      mergesort(arr12, m+1, r);
      merge(arr12, l, m, r);
    }
  }

  static void printArry(int arr12[]) {
    for (int i : arr12) {
      System.out.print(i);
      System.out.print(" ");
    }
  }

  public static void main(String args[]) {
    int arr12[] = { 9, 5, 2, 7, 1, 80, 6 };
    mergesort(arr12, 0, arr12.length - 1);
    printArry(arr12);
  }
}
