import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 2.5);
        map.put("orange", 3.5);
        map.put("banana", 4.5);
        map.put("coconut", 4.00);

//        System.out.println(map);
//        System.out.println(map.get("apple"));
//        map.remove("apple");
//        System.out.println(map);
//        System.out.println(map.containsKey("apple"));
//        System.out.println(map.containsValue(4));
//        if(map.containsKey("apple")){
//            System.out.println(map.get("apple"));
//        }
//        else{
//            System.out.println("Key not found");
//        }
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println(map.get("/////////"));
        //Another Way
        HashMap<Double, String> map2 = new HashMap<>();
        map2.put(2.5, "apple");
        map2.put(3.5, "orange");
        map2.put(4.5, "banana");
        map2.put(6.5, "coconut");
        for(var entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//        "Keep the order I inserted" → LinkedHashMap
//
//        "Keep keys sorted" → TreeMap
//
//        "I don't care about order, just want fast lookup" → HashMap
    }
}