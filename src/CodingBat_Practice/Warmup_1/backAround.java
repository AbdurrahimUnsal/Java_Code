package CodingBat_Practice.Warmup_1;

public class backAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt". The original string will be length 1 or more.
     backAround("cat") → "tcatt"
      backAround("Hello") → "oHelloo"
      backAround("a") → "aaa"
     */


    public static String backAround(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }

    public static void main(String[] args) {
        System.out.println(backAround("cat"));    // Output: tcatt
        System.out.println(backAround("Hello"));  // Output: oHelloo
        System.out.println(backAround("a"));      // Output: aaa
    }
}
