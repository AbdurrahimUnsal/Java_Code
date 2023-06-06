package CodingBat_Practice.Map_2;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "b"};
        String[] arr2 = {"a", "b", "a", "c", "b"};
        String[] arr3 = {"c", "b", "a"};

        System.out.println(word0(arr1));  // Output: {a=0, b=0}
        System.out.println(word0(arr2));  // Output: {a=0, b=0, c=0}
        System.out.println(word0(arr3));  // Output: {a=0, b=0, c=0}
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            map.put(str, 0);
        }

        return map;
    }
}
