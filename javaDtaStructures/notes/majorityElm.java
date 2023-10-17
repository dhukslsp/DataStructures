public class majorityElm {
    static void printtable(int i){
        if(i >10){
            return;
        }
        System.out.println(i*2);
        i+=1;
        printtable(i);
    }
    public static void main(String args[]){
        printtable(0);
    }
}
