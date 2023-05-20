package javaCodingPractice;
import java.util.HashMap;
import java.util.Map;
public class C04 {

    public static void main(String[] args) {
        /*
        Given any String print out how many times each character is found in the String
         */

        String input = "Hello, World!";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }
    }

