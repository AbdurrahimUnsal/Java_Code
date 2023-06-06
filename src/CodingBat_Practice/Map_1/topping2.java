package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class topping2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");

        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");

        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");

        System.out.println(topping2(map1));  // Output: {yogurt=cherry, ice cream=cherry}
        System.out.println(topping2(map2));  // Output: {yogurt=cherry, spinach=nuts, ice cream=cherry}
        System.out.println(topping2(map3));  // Output: {yogurt=salt}
    }

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }
}
