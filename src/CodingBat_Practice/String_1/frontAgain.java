package CodingBat_Practice.String_1;

public class frontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            return firstTwo.equals(lastTwo);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));  // true
        System.out.println(frontAgain("edit"));    // false
        System.out.println(frontAgain("ed"));      // true
    }
}
