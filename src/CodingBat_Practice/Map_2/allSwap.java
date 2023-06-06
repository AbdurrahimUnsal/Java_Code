package CodingBat_Practice.Map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class allSwap {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "ac"};
        String[] arr2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] arr3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println(Arrays.toString(allSwap(arr1)));  // Output: ["ac", "ab"]
        System.out.println(Arrays.toString(allSwap(arr2)));  // Output: ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
        System.out.println(Arrays.toString(allSwap(arr3)));  // Output: ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    }

    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar)) {
                int swapIndex = map.get(firstChar);
                swap(strings, i, swapIndex);
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }

        return strings;
    }

    private static void swap(String[] strings, int i, int j) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;
    }
}
