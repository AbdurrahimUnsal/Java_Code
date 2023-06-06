package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordCount(arr1));  // Output: {a=2, b=2, c=1}
        System.out.println(wordCount(arr2));  // Output: {a=1, b=1, c=1}
        System.out.println(wordCount(arr3));  // Output: {c=4}
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, count + 1);
            } else {
                map.put(str, 1);
            }
        }

        return map;
    }
}
