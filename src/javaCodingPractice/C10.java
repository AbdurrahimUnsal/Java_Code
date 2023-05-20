package javaCodingPractice;

public class C10 {
    public static String findUniqueCharacters(String str) {
        /*
        Write a return method that can find the unique characters from the String
        Java :: 21
        Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */
                StringBuilder result = new StringBuilder();
                // Convert the string to lowercase to treat uppercase and lowercase letters as the same
                String lowercaseStr = str.toLowerCase();
                // Iterate through each character in the string
                for (int i = 0; i < lowercaseStr.length(); i++) {
                    char currentChar = lowercaseStr.charAt(i);
                    // Check if the current character is unique (i.e., not present in the result string)
                    if (result.indexOf(String.valueOf(currentChar)) == -1) {
                        result.append(currentChar);
                    }
                }
                return result.toString();
            }
            public static void main(String[] args) {
                String input = "AAABBBCCCDEF";
                String uniqueCharacters = findUniqueCharacters(input);
                System.out.println("Unique characters: " + uniqueCharacters);
            }
        }


