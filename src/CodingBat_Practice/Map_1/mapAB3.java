package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapAB3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");

        System.out.println(mapAB3(map1));  // Output: {a=aaa, b=aaa, c=cake}
        System.out.println(mapAB3(map2));  // Output: {a=bbb, b=bbb, c=cake}
        System.out.println(mapAB3(map3));  // Output: {a=aaa, b=bbb, c=cake}
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }

        return map;
    }
}
