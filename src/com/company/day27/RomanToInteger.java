package com.company.day27;
import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public static int romanToInt(String s) {
        // Create a map to store the values of Roman
        Map<Character, Integer> Map = new HashMap<>();
        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = Map.get(s.charAt(i));

            // If the current value is smaller than the previous value, subtract it
            if (currValue < prevValue) {
                result -= currValue;
            }
            // Otherwise, add it to the result
            else {
                result += currValue;
                prevValue = currValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int intValue = romanToInt(roman);
        System.out.println("Roman : " + roman);
        System.out.println("Integer: " + intValue);
    }
}
