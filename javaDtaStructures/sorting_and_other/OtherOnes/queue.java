package javaDtaStructures.sorting_and_other.OtherOnes;

class queue {
    static int size = 5;
    static int elements[] = new int[size];
    static int last = -1;
    static int first = -1;
    static boolean isfull(){
        if(last >= size - 1){
            return true;
        }
        else{
            return false;
        }
    }
    static void enqueue(int elm){
        if(isfull()){
            System.out.println("The queue is full");
        }
        if(last == -1 && first == -1){
            last = 0;
            first = 0;
            elements[last] = elm;
        }
        else{
            last++;
            elements[last] = elm;
        }
    }
    static void prqueue(){
        int i;
        for(i =first;i<=last;i++){
            System.out.println(elements[i]+" ");
        }
    }
    static void dequeue(){
        if(first == last){
            first = -1;
            last = -1;
        }
        else{
            first += 1;
        }
    }
  public static void main(String[] args) {
    enqueue(12);
    enqueue(14);
    dequeue();
    prqueue();
  }
}
