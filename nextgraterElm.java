public class nextgraterElm {
    public void nextGraterRlm1(int number){
        char n[] = (Integer.toString(number)).toCharArray();
        for(char i:n){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        nextgraterElm obj1 = new nextgraterElm();
        obj1.nextGraterRlm1(16);
    }
}