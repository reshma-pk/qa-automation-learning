import java.util.Map;
import java.util.TreeMap;

public class FrequencyCount {

    public static void main(String[] args) {
        int[] arr = {10,30,10,20,30,10};

        Map<Integer,Integer> map = new TreeMap<>();

        for(int num:arr) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int key:map.keySet()) {
            System.out.println(key + "--> " + map.get(key));
        }
    }
    
}