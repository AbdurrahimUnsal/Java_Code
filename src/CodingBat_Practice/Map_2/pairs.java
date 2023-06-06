package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args) {
        String[] arr1 = {"code", "bug"};
        String[] arr2 = {"man", "moon", "main"};
        String[] arr3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(arr1));  // Output: {b=g, c=e}
        System.out.println(pairs(arr2));  // Output: {m=n}
        System.out.println(pairs(arr3));  // Output: {g=d, m=n, n=t}
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            map.put(firstChar, lastChar);
        }

        return map;
    }
}
