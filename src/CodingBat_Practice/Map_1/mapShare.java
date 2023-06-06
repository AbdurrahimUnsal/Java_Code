package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");

        System.out.println(mapShare(map1));  // Output: {a=aaa, b=aaa}
        System.out.println(mapShare(map2));  // Output: {b=xyz}
        System.out.println(mapShare(map3));  // Output: {a=aaa, b=aaa, d=hi}
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            String valueA = map.get("a");
            map.put("b", valueA);
        }

        map.remove("c");

        return map;
    }
}
