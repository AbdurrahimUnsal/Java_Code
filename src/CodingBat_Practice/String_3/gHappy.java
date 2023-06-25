package CodingBat_Practice.String_3;

public class gHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));          // true
        System.out.println(gHappy("xxgxx"));           // false
        System.out.println(gHappy("xxggyygxx"));       // false
    }

    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                // Check if there is a 'g' on the left or right side
                if ((i > 0 && str.charAt(i - 1) == 'g') || (i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    continue;  // Found a happy 'g', continue to the next iteration
                } else {
                    return false;  // Found an unhappy 'g', return false
                }
            }
        }
        return true;  // All 'g's are happy
    }
}
