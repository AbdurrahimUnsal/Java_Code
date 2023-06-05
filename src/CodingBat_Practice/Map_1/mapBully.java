package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");

        System.out.println(mapBully(map1));  // Output: {a=, b=candy}
        System.out.println(mapBully(map2));  // Output: {a=, b=candy}
        System.out.println(mapBully(map3));  // Output: {a=, b=candy, c=meh}
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
