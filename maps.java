import java.util.HashMap;
import java.util.Map;

public class maps {

    public static void main() {
        Map<String , Integer> map =new HashMap<>();
            map.put("apple",17);
        map.put("apple plus",16);
        map.put("apple pro max mini",15);
        map.put("apple pro max",14);
        map.put("apple mini",13);
        map.put("apple pro",12);


//            System.out.println(map.containsKey("apple"));
//        System.out.println(map.containsValue(17));
            for (String key:map.keySet()){
                System.out.println(key+" "+map.get(key));
            }
    }}

