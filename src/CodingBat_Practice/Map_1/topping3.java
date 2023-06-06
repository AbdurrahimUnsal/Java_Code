package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class topping3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");

        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");

        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        map3.put("potato", "ketchup");

        System.out.println(topping3(map1));  // Output: {potato=ketchup, fries=ketchup}
        System.out.println(topping3(map2));  // Output: {potato=butter, fries=butter}
        System.out.println(topping3(map3));  // Output: {spinach=oil, salad=oil, potato=ketchup, fries=ketchup}
    }

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}
