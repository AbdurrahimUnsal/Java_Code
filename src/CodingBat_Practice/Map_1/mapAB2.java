package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapAB2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");

        System.out.println(mapAB2(map1));  // Output: {c=cake}
        System.out.println(mapAB2(map2));  // Output: {a=aaa, b=bbb}
        System.out.println(mapAB2(map3));  // Output: {a=aaa, b=bbb, c=aaa}
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
