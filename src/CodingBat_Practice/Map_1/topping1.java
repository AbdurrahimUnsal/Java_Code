package CodingBat_Practice.Map_1;

import java.util.HashMap;
import java.util.Map;

public class topping1 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");

        Map<String, String> map2 = new HashMap<>();

        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");

        System.out.println(topping1(map1));  // Output: {bread=butter, ice cream=cherry}
        System.out.println(topping1(map2));  // Output: {bread=butter}
        System.out.println(topping1(map3));  // Output: {bread=butter, pancake=syrup}
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;
    }
}
