package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {
        String[] arr1 = {"salt", "tea", "soda", "toast"};
        String[] arr2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] arr3 = {};

        System.out.println(firstChar(arr1));  // Output: {s=saltsoda, t=teatoast}
        System.out.println(firstChar(arr2));  // Output: {a=aaaAA, b=bb, c=cccCC, d=d}
        System.out.println(firstChar(arr3));  // Output: {}
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            map.put(firstChar, map.getOrDefault(firstChar, "") + str);
        }

        return map;
    }
}
