package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(arr1));  // Output: {"a": true, "b": true, "c": false}
        System.out.println(wordMultiple(arr2));  // Output: {"a": false, "b": false, "c": false}
        System.out.println(wordMultiple(arr3));  // Output: {"c": true}
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> resultMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            resultMap.put(str, countMap.get(str) >= 2);
        }

        return resultMap;
    }
}
