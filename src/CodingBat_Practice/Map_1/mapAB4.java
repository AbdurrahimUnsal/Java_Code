package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");

        System.out.println(mapAB4(map1));  // Output: {a=aaa, b=bb, c=aaa}
        System.out.println(mapAB4(map2));  // Output: {a=aa, b=bbb, c=bbb}
        System.out.println(mapAB4(map3));  // Output: {a=aa, b=bbb, c=bbb}
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        String aValue = map.get("a");
        String bValue = map.get("b");

        if (aValue != null && bValue != null) {
            int aLength = aValue.length();
            int bLength = bValue.length();

            if (aLength != bLength) {
                String longerValue = (aLength > bLength) ? aValue : bValue;
                map.put("c", longerValue);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }
    }

