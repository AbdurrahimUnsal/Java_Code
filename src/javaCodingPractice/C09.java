package javaCodingPractice;

public class C09 {
    public static String removeDup(String input) {
        /*
        Write a return method that can remove the duplicate values from String
        Ex: removeDup("AAABBBCCC") ==> ABC

         */
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result); // Output: ABC
    }
}
