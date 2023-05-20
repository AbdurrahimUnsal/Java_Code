package javaCodingPractice;

public class C08 {
    public static void main(String[] args) {
        /*
        Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2E5
         */
        String input = "AAABBCDDEEEEEffffffff";
        String frequency = getCharacterFrequency(input);
        System.out.println(frequency);
    }
    public static String getCharacterFrequency(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        return result.toString();
    }
    }

