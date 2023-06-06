package CodingBat_Practice.Map_2;

import java.util.*;

public class firstSwap {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "ac"};
        String[] arr2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] arr3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println(Arrays.toString(firstSwap(arr1)));  // Output: ["ac", "ab"]
        System.out.println(Arrays.toString(firstSwap(arr2)));  // Output: ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        System.out.println(Arrays.toString(firstSwap(arr3)));  // Output: ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
    }

    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> swappedChars = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);

            if (map.containsKey(firstChar) && !swappedChars.contains(firstChar)) {
                int swapIndex = map.get(firstChar);
                swap(strings, i, swapIndex);
                swappedChars.add(firstChar);
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
