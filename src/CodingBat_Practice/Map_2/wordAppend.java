package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a"};
        String[] arr2 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] arr3 = {"a", "", "a"};

        System.out.println(wordAppend(arr1));  // Output: "a"
        System.out.println(wordAppend(arr2));  // Output: "aa"
        System.out.println(wordAppend(arr3));  // Output: "a"
    }

    public static String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> countMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            if (countMap.get(str) % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }
}
