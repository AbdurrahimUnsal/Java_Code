package CodingBat_Practice.Warmup_1;

public class stringE {
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
                if (count > 3) {
                    return false;
                }
            }
        }
        return count >= 1;
    }
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));    // true
        System.out.println(stringE("Heelle"));   // true
        System.out.println(stringE("Heelele"));  // false
    }

}
