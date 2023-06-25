package CodingBat_Practice.String_2;

public class catDog {
    public static void main(String[] args) {
        String string1 = "catdog";
        boolean result1 = catDog(string1);
        System.out.println(result1);  // true

        String string2 = "catcat";
        boolean result2 = catDog(string2);
        System.out.println(result2);  // false

        String string3 = "1cat1cadodog";
        boolean result3 = catDog(string3);
        System.out.println(result3);  // true
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String substring = str.substring(i, i + 3);
            if (substring.equals("cat")) {
                catCount++;
            } else if (substring.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }
}
