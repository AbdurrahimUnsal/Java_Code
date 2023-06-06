package CodingBat_Practice.Map_1;
import java.util.HashMap;
import java.util.Map;
public class mapAB {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        System.out.println(mapAB(map1));  // Output: {a=Hi, ab=HiThere, b=There}
        System.out.println(mapAB(map2));  // Output: {a=Hi}
        System.out.println(mapAB(map3));  // Output: {b=There}
    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");
            String valueAB = valueA + valueB;
            map.put("ab", valueAB);
        }
        return map;
    }
        }
