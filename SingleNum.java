import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HAshmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> obj12 = new HashMap<>();
        obj12.put(12, 20);
        obj12.put(17, 74);
        for(Map.Entry<Integer,Integer> e:obj12.entrySet()){
            System.out.println(e.getKey()+"|"+e.getValue());
        }
        Set<Integer> keys = obj12.keySet();
        for(int i:keys){
            System.out.println(i+"|"+obj12.get());
        }
    }
}
